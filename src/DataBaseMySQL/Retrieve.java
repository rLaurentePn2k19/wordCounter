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
 * @author 2ndyrGroupB
 */
public class Retrieve implements CRUD {

    public Retrieve() {
    }

    @Override
    public Object[][] RetrieveData() {
        Object[][] data = new Object[1000][4];
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/word_counter";
        final String USER = "root";
        final String PASS = "";
        Connection conn = null;
        Statement stmt = null;
        String retrieveQuery;
        retrieveQuery = String.format("SELECT * from `test`");
        try {
            int cols = 0;
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(retrieveQuery);
            System.out.println(rs);
            while (rs.next()) {
                data[cols][0] = rs.getInt("id");
                data[cols][1] = rs.getString("word");
                data[cols][2] = rs.getInt("count");
                data[cols][3] = rs.getString("school");
                ++cols;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String checkQuery = "Select word from `test`";
        }
        return data;
    }

    @Override
    public void UpdateData(String word, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsertData(String word, int count, String school) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteData(String word, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
