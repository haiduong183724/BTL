/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


/**
 *
 * @author Hai Duong
 */
public class Input {
    private static final String COMMA_DELIMITER = ",";


    public Input(String file_name) {

        list_input = getListIn(file_name);
    }
    
     public  ArrayList<List<String>> list_input;

    private ArrayList<List<String>> getListIn(String file_name) {
        ArrayList<List<String>> arr = new ArrayList();
        
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(file_name));
            br.readLine();
            while ((line = br.readLine()) != null) {
               arr.add(this.parseCsvLine(line));
            }
 
        } catch (IOException e) {
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
            }
    }
        return arr;
        
   

    }
     public List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            result.addAll(Arrays.asList(splitData));
        }
        return result;
    }
   
    
    
}
    


    

