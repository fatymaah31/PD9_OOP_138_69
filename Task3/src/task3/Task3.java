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
        
    }
    
}
