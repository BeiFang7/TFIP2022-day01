package myapp;

import java.io.Console;

public class DraftCalculate{
  public static void main(String[] args){
    Console cons = System.console();

    // define user input as String, and sum as Integer
    int sumOfNumbers = 0;
    String number = "";
    
    // while user input anything, read from console
    while(number.trim().length() >=0){
      number = cons.readLine("Enter a number: ");

      // if user input "stop", print the total is sum
      if (number.trim().equals("stop")){
      System.out.printf("The total is %s.", sumOfNumbers);
      break;
      }

      // to change user input from String to Integer
      int num = Integer.parseInt(number.trim());

      // to add the user input to sum
      sumOfNumbers = sumOfNumbers + num;
    
    }
  }
}
