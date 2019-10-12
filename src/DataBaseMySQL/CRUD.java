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
    
    public void Create(String word, int count);
    public void Delete(String word, int count);
    public void Retrieve(String word, int count);
    public void Update(String word, int count);
    
}
