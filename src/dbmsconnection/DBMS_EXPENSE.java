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
import java.time.Month;

public class DBMS_EXPENSE {
    public static int dbms_expense_cal(String Username){
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ets","root","Arrive#1");
           Statement stmt=con.createStatement();
           LocalDate currentDate= LocalDate.now();
           int month = currentDate.getMonthValue();
           System.out.println(month);
           ResultSet rs= stmt.executeQuery("select sum(amount) from transactions where Username='"+Username+"' and type='E' and extract(month from transaction_date)=extract(month from CURDATE())");
           while(rs.next()){
               System.out.println("Entered");
               return rs.getInt("SUM(AMOUNT)");
           }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not established"+e);
                    
        }
        return 0;
    }
    
    public static int dbms_income_cal(String Username){
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/ets","root","Arrive#1");
           Statement stmt=con.createStatement();
           LocalDate currentDate= LocalDate.now();
           int month = currentDate.getMonthValue();
           System.out.println(month);
           ResultSet rs= stmt.executeQuery("select sum(amount) from transactions where Username='"+Username+"' and type='I' and extract(month from Transaction_date)=extract(month from CURDATE())");
           while(rs.next()){
               System.out.println("Entered");
               return rs.getInt("SUM(AMOUNT)");
           }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not established"+e);
                    
        }
        return 0;
    }
}
