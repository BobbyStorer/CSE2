//Robert W Storer
//CSE002 HW Assignment 3
//Timer Program
//Septemeber 15, 2015
//Professor Fouh

//Goal: Write a program that allows the user to enter the current time and what time dinner is.
//The program will return how long until dinner.

import java.util.Scanner;  //import Scanner class

    public class Timer {   // add class
    public static void main (String [] args) { //add main method
        
        Scanner myScanner = new Scanner(System.in); //create instance of the scanner class
        
            System.out.printf("What time is it right now (in military time)? : "); //prompt user to enter current time
            int currentTime = myScanner.nextInt(); //accepts user input
            
            System.out.printf("What time is dinner (in military time)? : "); //prompts user to enter dinner time
            int dinnerTime = myScanner.nextInt(); //accepts user input
            
                
                int hoursFix1 = currentTime/100; //I came up with this trick to isolate the "hour" digits of the total user-entered number
                int hoursFix2 = dinnerTime/100;
                int hoursLeft = (hoursFix2-hoursFix1); //this variable is the hours left until dinner.

                int minutesFix1 = (currentTime % 100); //I came up with this trick to isolate the "minute" digits of the total user-entered number
                int minutesFix2 = (dinnerTime % 100);
                int minutesLeft = (minutesFix2-minutesFix1); //this variable is the minutes left until dinner.
                
                    System.out.println("You have " + hoursLeft + " hours and " + minutesLeft + " minutes left until dinner!");
                    //the above line prints the final results
        
        
        
        
    } //close main method
    } //close class
