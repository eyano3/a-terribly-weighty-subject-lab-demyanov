package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    //Initialize our ounce converter and input reader
    Converter converterOunces = new Converter();
    Scanner userReader = new Scanner(System.in);

    //Welcome User and collect input
    System.out.println("Welcome to the Ounce Convertor.");
    System.out.println("Please enter the amount of Ounces: ");
    String userQuantityOunces = userReader.nextLine();
    System.out.println("Your input was received.");

    //Convert User input
    float userQuantityPounds = converterOunces.toPounds(userQuantityOunces);
    String userQuantityPoundsAndOunces = converterOunces.toPoundsAndOunces(UserQuantityOunces);

    //Return requested output
    System.out.println(userQuantityOunces + " Ounces is " + userQuantityPounds "Pounds.");
    System.out.println(userQuantityOunces + " Ounces is " + userQuantityPoundsAndOunces + ".");
    System.out.println("Thank you for using the Ounce Converter.")


  }
}
