/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itreturns;


import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ITReturns
{
    private static ResultSet data = null;
    
    public static void main(String[] args) 
    {
        connection();
    }

    public static Connection connection()
    {
        
       
        String url = "jdbc:mysql://localhost/";
        String dbName = "ITReturns";
        String userName = "root"; 
        String password = "kavoorkamakshi";
        Connection db = null;
        
        try {
            System.out.println("Connected to the DB");
            db = DriverManager.getConnection(url+dbName,userName,password);
            //Statement query = (Statement) db.createStatement(); 
            //query.executeUpdate("INSERT INTO LOGIN(username, password) VALUES ('java"+value+"', 'jones')");
            
            //data = query.executeQuery("select * from LOGIN");
            //printData(data);
            
            //db.close();
            //System.out.println("closed connection");
        } catch (SQLException ex) {
            Logger.getLogger(ITReturns.class.getName()).log(Level.SEVERE, null, ex);
        }
        return db;

    }

    private static void printData(ResultSet data) throws SQLException
    {
        System.out.println("Now here are the names on the table");
        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");
        
        while (data.next()) 
        {
            //int id = data.getInt("id");
            String firstName = data.getString("username");
            //String lastName = data.getString("lastName");
            
            //System.out.println("ID: "+ id);
            //System.out.println("FirstName: " + firstName);
            //System.out.println("lastName: " + lastName);
            System.out.println("************************************");
            System.out.println("************************************");
            System.out.println("************************************");
        }
    }
}