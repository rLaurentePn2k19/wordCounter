/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseMySQL;

/**
 *
 * @author 2ndyrGroupB
 */
public interface CRUD {
    
    public void InsertData(String word, int count, String school);
    public void DeleteData(String word, int count);
    public Object[][] RetrieveData();
    public void UpdateData(String word, int count);
    
}
