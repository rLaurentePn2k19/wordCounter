/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 2ndyrGroupB
 */
public class Create implements CRUD {
    
    @Override
    public void InsertData(String word, int count,String school){
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/word_counter";
        final String USER = "root";
        final String PASS = "";
        Connection conn = null;
        Statement stmt = null;
        String insertQuery; 

        insertQuery = String.format("INSERT INTO `test` (word,count,school) " + "VALUES ('%s','%d','%s')", word, count,school);
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(insertQuery);
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void DeleteData(String word, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[][] RetrieveData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateData(String word, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
