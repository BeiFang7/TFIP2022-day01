// package myapp;

// import java.io.Console;

// public class Calculate{
//   public static void main(String[] args){
//     Console cons = System.console();

//     // define user input as String, and sum as Integer
//     int sumOfNumbers = 0;
//     String number = "";
    
//     // while user input anything, read from console
//     while(number.trim().length() >=0){
//       number = cons.readLine("Enter a number: ");

//       // if user input "stop", print the total is sum
//       if (number.trim().equals("stop")){
//       System.out.printf("The total is %s.", sumOfNumbers);
//       break;
//       }

//       // to change user input from String to Integer
//       int num = Integer.parseInt(number.trim());

//       // to add the user input to sum
//       sumOfNumbers = sumOfNumbers + num;
    
//     }
//   }
// }


package myapp;

import java.io.Console;

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
