package shop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
import java.sql.*;
import java.util.*;
public class shop1 {
   public Connection con=null;
    
    public void connect()
    {
         
     try{
      Class.forName("org.apache.derby.jdbc.ClientDriver");
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/Sample3","Ganesh","Ganesh@123");
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
        
    }
    public int check(String username, String password)
    {
        
     connect();
     int y=0;
       try
        {
            
            PreparedStatement pst = con.prepareStatement("select count(*) from login where username =? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet r = pst.executeQuery();
            r.next();
            y = r.getInt(1);
            con.commit();
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       return y;
    }
    public void insert(String name,int cp, int sp)
    {
        connect();
        int count=0;
        try{
            PreparedStatement pst = con.prepareStatement("select count(*) from stock");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt(1) + 1;
            PreparedStatement pst1 = con.prepareStatement("insert into stock values(?,?,?,?)");
            pst1.setInt(1, count);
            pst1.setString(2, name);
            pst1.setInt(3, cp);
            pst1.setInt(4, sp);
            pst1.executeUpdate();
            con.commit();
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public ArrayList<ArrayList> data()
    {
        connect();
        ArrayList<ArrayList> x = new ArrayList();
        try{
            PreparedStatement pst = con.prepareStatement("select * from stock");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                ArrayList<String> y = new ArrayList();
                y.add(Integer.toString(rst.getInt(1)));
                y.add(rst.getString(2));
                y.add(Integer.toString(rst.getInt(3)));
                y.add(Integer.toString(rst.getInt(4)));
                x.add(y);
            }
              }
        catch(Exception e )
        {
            System.out.println(e);
        }
        return x;
    }
    public void insertpurchase(String v_name,String product, int quantity, int c_price, int total)
    {
        connect();
        int count=0;
        try{
            PreparedStatement pst = con.prepareStatement("select count(*) from purchase");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt(1) + 1;
            PreparedStatement pst1 = con.prepareStatement("insert into purchase values(?,?,?,?,?,?)");
            pst1.setInt(1, count);
            pst1.setString(2, v_name);
            pst1.setString(3, product);
            pst1.setInt(4,quantity);
            pst1.setInt(5, c_price);
            pst1.setInt(6, total);

            pst1.executeUpdate();
            con.commit();
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
    public ArrayList<ArrayList> insertpurchase()
    {
        connect();
        ArrayList<ArrayList> x = new ArrayList();
        try{
            PreparedStatement pst = con.prepareStatement("select * from purchase");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                ArrayList<String> y = new ArrayList();
                y.add(Integer.toString(rst.getInt(1)));
                y.add(rst.getString(2));
                y.add(rst.getString(3));
                y.add(Integer.toString(rst.getInt(4)));
                y.add(Integer.toString(rst.getInt(5)));
                y.add(Integer.toString(rst.getInt(6)));

                x.add(y);
            }
              }
        catch(Exception e )
        {
            System.out.println(e);
        }
        return x;
    }
    
    public void insertbill(String c_name,String product, int quantity, int c_price, int total)
    {
        connect();
        int count=0;
        try{
            PreparedStatement pst = con.prepareStatement("select count(*) from bill");
            ResultSet rst = pst.executeQuery();
            rst.next();
            count = rst.getInt(1) + 1;
            PreparedStatement pst1 = con.prepareStatement("insert into bill values(?,?,?,?,?,?)");
            pst1.setInt(1, count);
            pst1.setString(2, c_name);
            pst1.setString(3, product);
            pst1.setInt(4, c_price);
            pst1.setInt(5, total);
            pst1.setInt(6,quantity);
            pst1.executeUpdate();
            con.commit();
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
    public int val(String p)
    {
        connect();
        int y=0;
        try
        {
            PreparedStatement pst = con.prepareStatement("select quantity from purchase where product=?");
            pst.setString(1, p);
            ResultSet r = pst.executeQuery();
            r.next();
            y = r.getInt(1);
            con.commit();
            con.close();
            
        }
         catch(Exception e)
                 {
                     System.out.println(e);
                 }
          return y;
    }
    public void minus(String p,int count)
    {
      connect();
      
      try
        {
            PreparedStatement pst = con.prepareStatement("update stock set quantity=? where product =?");
            pst.setInt(1, count);
            pst.setString(2, p);
            
            pst.executeUpdate();
            
            con.commit();
            con.close();
            
        }
         catch(Exception e)
                 {
                     System.out.println(e);
                 }
          
    }
    public ArrayList<ArrayList> generatebill()
    {
        connect();
        ArrayList<ArrayList> x = new ArrayList();
        try{
            PreparedStatement pst = con.prepareStatement("select * from bill");
            ResultSet rst = pst.executeQuery();
            while(rst.next())
            {
                ArrayList<String> y = new ArrayList();
                y.add(Integer.toString(rst.getInt(1)));
                y.add(rst.getString(2));
                y.add(rst.getString(3));
                y.add(Integer.toString(rst.getInt(4)));
                y.add(Integer.toString(rst.getInt(5)));
                y.add(Integer.toString(rst.getInt(6)));

                x.add(y);
            }
              }
        catch(Exception e )
        {
            System.out.println(e);
        }
        return x;
    }
    
     public int auto(String p)
    {
        connect();
        int y=0;
        try
        {
            PreparedStatement pst = con.prepareStatement("select selling_price from stock where product=?");
            pst.setString(1, p);
            ResultSet r = pst.executeQuery();
            r.next();
            y = r.getInt(1);
            con.commit();
            con.close();
            
        }
         catch(Exception e)
                 {
                     System.out.println(e);
                 }
          return y;
    }
}
