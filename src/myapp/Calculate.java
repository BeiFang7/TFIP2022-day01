package myapp;

import java.io.Console; //import java.io package (package io in a package java) and console class

public class Calculate{
   public static void main(String[] args){
    String input = "";
    Integer total = 0;
    Integer count = 0;
    
    //Get the console
    Console cons = System.console();
    
    //while (true) is dangerous, infinite loop if dont receive "stop" will never exit the loop.
    while(!input.equals("stop")){ 
      //Read a Line
      input = cons.readLine("Please enter a number: ");
      //trim away all unnecessary zeros from user input
      input = input.trim();
      
      if (input.equals("stop")){
        //exit the while loop
        break;
      }
      
      //count += 1;
      count++; 

      // Integer value = Integer.parseInt(input);
      // total += value;
      total +=Integer.parseInt(input);
    }
    //%d is digits
    System.out.printf("The total of addng %d number is %d\n.",count,total);

  }
}
