//Robert W. Storer
//CSE002 Lab 3
//Professor Fouh
//Septemeber 10. 2015

//Goal: To practice using the Scanner class to obtain user input.
//The program will obtain information about a restaurant check from the user and split the bill evenly amongst the group.

import java.util.Scanner; //import the scanner class

    public class Check {  //add class
    public static void main (String [] args) { //add main method
    
        Scanner myScanner = new Scanner (System.in); //create instance of the scanner class
        
            System.out.print("What was the total amount of your bill? "); //prompt user to enter bill amount
            double restaurantBill = myScanner.nextDouble(); //this statement allows program to accept user input
            
            System.out.print("What percentage tip would you like to leave your server? "); //prompt user to enter tip %
            double tipPercentage = myScanner.nextDouble(); //accept user input
            tipPercentage /= 100; //this will turn the % into a decimal for arithmetic purposes
            
            System.out.print("How many people were in the group? "); //prompt user to enter party size
            int partySize = myScanner.nextInt(); //accept user input
            
                //the next two line declare the variables that are used as the results for this program            
                double totalCost = (restaurantBill*(1+tipPercentage));
                double perPerson = (totalCost/partySize);
                
                    //The next three variables are used to print the double "perPerson" as three individual integers.
                    //the mod feature returns the remainder after the division
                    int dollars = (int) perPerson;
                    int dimes = (int) (perPerson*10) % 10;
                    int pennies = (int) (perPerson*100) % 10;
                    
                        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); //show user how much each member of the group owes for the bill.
                
            
        
        
    } //close main method
} //close class

