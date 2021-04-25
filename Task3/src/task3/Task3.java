/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author fatym
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static String ridMultipleBlank(String s)
    {
      s = s.replaceAll("( )+", " ");
      return s;

    }
   
    public static String removeInteger(String s)
    {
      s = s.replaceAll("[0-9]","");
      return s;
    
    }
    
    public static String stringEncryption(String s)
    {
        char[] arr = s.toCharArray();
        int random;
        random=4;
        String encrypt="";
        String ch;
        
        for(int i=0 ; i<arr.length/3 ; i++)
        {
            
            arr[i]= (char)(arr[i] + random);
            ch=Character.toString(arr[i]);
            encrypt=encrypt+ ch;
        }
        return encrypt;
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        String s,a;
        
        //Remove space
        System.out.println("Input String: ");
        s= scanner.nextLine();
        a=ridMultipleBlank(s);
        System.out.println(a);
       
        //Remove Integar
        System.out.println("Input String: ");
        s= scanner.nextLine();
        a=removeInteger(s);
        System.out.println(a);
        
        //Encryption
        System.out.println("Input String: ");
        s= scanner.nextLine();
        a=stringEncryption(s);
        System.out.println(a);
        
      
    }
    
}
