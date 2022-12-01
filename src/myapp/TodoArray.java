package myapp;

public class TodoArray {

  public static void main (String[] args){

    //Create an array of 3 string element
    String[] tasks = new String[3];

    tasks[0] = "running";
    tasks[1] = "eating";
    tasks[2] = "sleeping";

    //not a proper value if you only print out tasks
    System.out.println(tasks);
    System.out.println(tasks[0]);
    System.out.println(tasks[1]);
    System.out.println(tasks[2]);

    //tell size of the array, PROBLEM is array is fixed size, there are better alternatives to array especially if 
    System.out.println(tasks.length);

    //Use a while loop to print out all elements of the array
    Integer index = 0;
    // cannot make index <= tasks.length because index will be 3, but the array[3] does not exists
    while (index < tasks.length){
      System.out.printf("%d: %s\n", index, tasks[index]);
      index++; 
    } 

    /*//Use a while loop to print out all elements of the array in opposite order.
    int i = tasks.length;
    while (i > 0){
      System.out.println(tasks[i-1]);
      i--;
    }*/
  }
  
}
