package myapp.ver1; //this is package within a package
import java.io.Console; //to import from other packages

public class UserInputWhile {

  public static void main(String[] args){
    //Get system console
    Console cons = System.console();

    //Read from the console, the result is assigned to a variable
    String name = "";
    while(name.trim().length() <=0){
      name = cons.readLine("What is your name? ");
    }

    if (name.trim().toLowerCase().equals("fred")){ 
      System.out.println("Yoohoo");
    } 
    else if (name.trim().toLowerCase().equals("barney")){ //can have multiple else if
      System.out.println("Barney I Love You.");
    }
    else if(name.trim().equals("")){ //cannot put a space in between the "", even with trim, trim will get rid of the user input space but not the " " that you are comparing with. 
    // OR name.trim().isEmpty()
    // OR name.trim().length() == 0
    // OR name.trim().equals("")
      System.out.println("You have not entered your name. Please enter again. ");
    }
    else{
      //Send a greeting to the name
      //System.out.println(name); //print a line
      System.out.printf("Hello %s. \n\t Nice to meet you.\n", name.toUpperCase()); //format print, %s a string will be placed here, the string is name, it doesnt put in a new line with only printf, need to insert \n for new line and \t for tab, toUpperCase is to change the user input to UpperCase.
    }
  }
}