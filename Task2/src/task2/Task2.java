/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author fatym
 */
public class Task2 {
    
    public static void displayVertical(String str) 
    {
        char line = '\0';
        String data1 = str.replaceAll("\\s", "");
        int size = data1.length();
        for(int i = 0;i<size;i++)
        {
            line = data1.charAt(i);
            System.out.println(line);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner object = new Scanner(System.in);
        String data = "";
        System.out.println("Please enter a Sentence");
        data = object.nextLine();
        displayVertical(data); 
    }
    
}
