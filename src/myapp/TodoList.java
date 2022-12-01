package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class TodoList {
  public static void main(String[] args){

    //Create a list of numbers
    List<Integer> listOfInt = new LinkedList<>();

    //Get the console
    Console cons = System.console();

    String item = "";

    // while loop continues till "stop" is entered.
    while (true){
      item = cons.readLine("Please enter a number: ");
      item = item.trim();

      if(item.equals("stop")) // if("stop".equals(item))
        break;
      
      //Add the item to the list
      listOfInt.add(Integer.parseInt(item));
    }

    System.out.printf("Number of elements in the list: %d\n",listOfInt.size());

    //for loop - initialise index, condition test, increment
    for (Integer index =0; index<listOfInt.size();index++)
      System.out.printf("[%d]: %s\n", index, listOfInt.get(index));
    }

    /*//while loop
    Integer index = o;
    while (index < listOfInt.size()){
      System.out.println(listOfInt.get(index));
      index++;
    }
    */
}
  
