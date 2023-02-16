/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbmsconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pranav krishna
 */
public class DBMS_SIGNUP {
    public static void dbms_signups(String Username,String email,String name,String password){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ets","root","Arrive#1");
           Statement stmt=con.createStatement();
           String command="insert into user_details values('"+Username+"','"+name+"','"+email+"')";
           String command2="insert into user values('"+Username+"','"+password+"')";
           int i=stmt.executeUpdate(command);
           int j=stmt.executeUpdate(command2);
           if(i>0){
               System.out.println("SUCCESSFUL");
           }
           else{
               System.out.println("Fail");
           }
           con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not established"+e);
                    
        }
    }
}
