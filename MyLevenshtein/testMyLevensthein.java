//Main program to test MyLevensthein.java

import java.util.Scanner;

class TestMyLevensthein{
  public static void main(String[] args)
  {
    
    String word1;
    String word2;
    //Initialize the MyLevensthein class
    MyLevensthein test;
    int stringDistance = test.distance();
    

    //Program title and instructions
    System.out.println("----CHECK YOUR STRINGS WITH MyLevensthein----");
  	System.out.println("This program is using the Levensthein algorithm");
  	System.out.println("to compute the distance between to strings");
  	
    //User input
  	System.out.print("Input a string: ");
    Scanner userInput = new Scanner(System.in);
    word1=userInput.next();

    //User input
    System.out.print("Input another string: ");
    userInput = new Scanner(System.in);
    word2 = userInput.next();

    //Compare strings
    test = new MyLevensthein(word1,word2);
    System.out.println("The distance between the two strings are: " + stringDistance);
  }
}
