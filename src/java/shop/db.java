/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ganesh
 */
public class db {
    public static void connect()
    {
         Connection con;
     try{
      Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket?zeroDateTimeBehavior=convertToNull","root","Gamesh@123");
         System.out.println(con);
     }
     catch(Exception e)
     {
         System.out.println(e);   
     }
        
    }
    public static void main(String[] args)
    {
        connect();
    }
}
