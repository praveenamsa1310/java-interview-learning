/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java.Database;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author PRAVEENAGRUD
 */
public class Db {
   
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pd","root","pd@75");
            Statement st = con.createStatement();
            String sql ="create table temddf(id INT)";
            int rs = st.executeUpdate(sql);
//            if(rs != null){
//                while(rs.next()){
//                    System.out.println("Id : "+rs.getString("id"));
//                    System.out.println("Name : "+rs.getString("name"));
//                    System.out.println("Age : "+rs.getString("age"));
//                    
//                }
//            }
        }
        catch(Exception e){
            System.out.println(e);
        }        
    }
}
