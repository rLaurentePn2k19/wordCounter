/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author laurentera_sd2022
 */
public class DbConnect {

    public static void main(String[] args) {
        System.out.println("db test");
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/word_counter";
        final String USER = "root";
        final String PASS = "";
        Connection conn = null;
        Statement stmt = null;
        
         try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String checkQuery = "Select * from test ";
            ResultSet rs = stmt.executeQuery(checkQuery);
            while (rs.next()) {
                System.out.printf("%s : %d",rs.getString("word"),rs.getInt("id"));
            }

        } catch (SQLException se) {
             System.out.println(se);
            //Handle errors for JDBC

        } catch (Exception e) {
                         System.out.println(e);

            //Handle errors for Class.forName

        }
    }
}