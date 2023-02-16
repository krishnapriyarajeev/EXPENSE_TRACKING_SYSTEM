/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbmsconnection;

import ets.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBMS_DELETE {
    public static void dbms_delete_tab(String Transaction_id){
        try {        
            Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/ets","root","Arrive#1");
           Statement stmt=con.createStatement();
           int i=stmt.executeUpdate("Delete from transactions where transaction_id="+Integer.parseInt(Transaction_id));
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
