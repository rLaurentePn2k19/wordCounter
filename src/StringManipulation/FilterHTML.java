/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import DataBaseMySQL.Create;

/**
 *
 * @author laurentera_sd2022
 */
public class FilterHTML {

    public String removeHTMLtags(String tags) {
        tags = tags.replaceAll("\\<[^>]*>", "");
        return tags;
    }

    public HashMap<String, Integer> countWords(String words) {
        Create insert = new Create();
        String[] list = words.trim().split("\\s+");
        HashSet<String> mySet = new HashSet<>(Arrays.asList(list));
        HashMap<String, Integer> countWords = new HashMap<>();
        for (String string : mySet) {
            int counter = 0;
            for (String test_string : list) {
                if (string.equals(test_string)) {
                    ++counter;
                }
            }

            countWords.put(string, counter);
            insert.InsertData(words, counter, "Usc");
        }
        return countWords;
    }

}
