/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author fatym
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static int wordCounter(String s)
      {
          int count = 1;
          int length =s.length();
          char[] arr=new char[length];
          arr=s.toCharArray();
          for(int i=0; i<length; i++)
          {
              //System.out.println("Enter the String: ");
              if(arr[i]==' ')
              {
                  count++;
                  //System.out.println("Enter the String");
              }
          
          }

          return count;
       }
    public static int vowelcounter(String s)
    {
          int count = 0;
          int length =s.length();
          char[] arr=new char[length];
          arr=s.toCharArray();
          for(int i=0; i<length; i++)
          {
              if(arr[i]=='a' || arr[i]=='A')
              {
                  count++;
              }
              else if(arr[i]=='e' || arr[i]=='E')
              {
                  count++;
              }
              else if(arr[i]=='i' || arr[i]=='I')
              {
                  count++;
              }
              else if(arr[i]=='o' || arr[i]=='O')
              {
                  count++;
              }
              else if(arr[i]=='u' || arr[i]=='U')
              {
                  count++;
              }
          }

          return count;
    
    }
     public static int puncCount(String s)
    {
          int count = 0;
          int length =s.length();
          char[] arr=new char[length];
          arr=s.toCharArray();
          for(int i=0; i<length; i++)
          {
             if(!(arr[i]>='A' && arr[i]<='Z'  ||  
                   arr[i]>='a' && arr[i]<='z' || 
                   arr[i]>='0' && arr[i]<='9' ||
                   arr[i]==' '))
             {
                   count++;
             }
          
          }
          
          
          
          return count;
    
    }
    
    public static boolean findSubString(String s, String sub)
    {
       boolean flag=false;
          int length =s.length();
          length=length;
          char[] arr=new char[length];
          arr=s.toCharArray();
          for(int i=0; i<length ; i++)
          {
              if(arr[i]=='t')
              {
                  if(arr[i+1]=='h')
                  {
                      if(arr[i+2]=='e')
                      {
                          flag=true;
                          
                      }
                  }
              }
          }
       
       
       return flag;
     
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s;
        s= scanner.nextLine();
        int num= wordCounter(s);
        System.out.println("Number of Words: " + num);
        num= vowelcounter(s);
        System.out.println("Number of Vowels: " + num);
        num= puncCount(s);
        System.out.println("Number of Punctuations: " + num);
        boolean flag= findSubString(s,"the");
        if(flag == true)
        {
            System.out.println("the is a part of this string.");
        }
        else
        {
           System.out.println("the is not a part of this string.");
        }
    }
    
}
