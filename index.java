/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ms4.toy.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Ms4ToyProblems {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       
       String myString;
       BufferedReader reader; 

reader = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("Enter a sentence "); 
myString = reader.readLine();
        try {
            myString = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Ms4ToyProblems.class.getName()).log(Level.SEVERE, null, ex);
        }

         
        
        
    }
    public static String capitalize (String myString) {
    String[] arr = myString.split(" ");
    StringBuilder sb = new StringBuilder();

        for (String arr1 : arr) {
            sb.append(Character.toUpperCase(arr1.charAt(0))).append(arr1.substring(1)).append(" ");
        }          
    return sb.toString().trim();
}  

    private static class InputStramReader {

        public InputStramReader(InputStream in) {
        }
    }
}
