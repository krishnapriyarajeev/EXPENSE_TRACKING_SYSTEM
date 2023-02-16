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
import java.time.LocalDate;

/**
 *
 * @author Pranav krishna
 */
public class DBMS_UPDATE {
    public static void dbms_update(String Transaction_id,String type,String Category,String Name,String Amount_String,String Date_String){
        try{
            LocalDate date = LocalDate.parse(Date_String);
            int Amount=Integer.parseInt(Amount_String);
            Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ets","root","Arrive#1");

           Statement stmt=con.createStatement();
           int i= stmt.executeUpdate("Update transactions set type='"+type.toUpperCase()+"', Category='"+Category.toUpperCase()+"', name='"+Name.toUpperCase()+"', amount="+Amount+", transaction_date='"+date+"' where transaction_id="+Integer.parseInt(Transaction_id));
           
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not established"+e);
                    
        }
    }
}
