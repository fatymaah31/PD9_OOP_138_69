/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author fatym
 */

class MyString{
        /**
     * This Function reverse a String
     * @param String
     * @return return a reverse String
     **/
    public static String reverse(String s)
    {
        String reverse = "";
        int size = s.length();
        for(int i = size-1 ; i >=0 ; i--)
        {
            reverse = reverse + s. charAt(i);
        }
        return reverse;
    }
    
    
    public int sumOfDigits(String s) 
    {
    int len = s.length();
    int sum = 0;
    for (int i = 0; i < len; i++) 
    {
        if (Character.isDigit(s.charAt(i))) 
            {
                String ss = s.substring(i,i+1);
                sum = sum+ Integer.parseInt(ss);
            }
    }
    return sum;
}
        
}


public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner object = new Scanner(System.in);
        MyString obj= new MyString();
        String data = "";
        System.out.println("Please enter a Sentence");
        data = object.nextLine();
        String reverse = obj.reverse(data);
        System.out.println(reverse);
        System.out.println("Please enter a Sentence to get sum of all digits in it");
        data=object.nextLine();
        System.out.println("The sum of the digits in the string is: "+obj.sumOfDigits(data));
    }
    
}
