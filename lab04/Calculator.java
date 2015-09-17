//Robert W. Storer
//CSE002 Lab 4
//Calculator Program
//Septemeber 17, 2015
//This program will give me practice using switch statements.

import java.util.Scanner; //import Scanner class

    public class Calculator { //create class
    public static void main (String [] args) { //add main method
    
        Scanner myScanner = new Scanner (System.in); //create an insatnce of the scanner class.
        
            System.out.printf("Enter an integer: "); //prompt user to enter an integer
            int a = myScanner.nextInt(); //accepts user input
            
            System.out.printf("Enter another integer: "); //prompts user to enter another integer
            int b = myScanner.nextInt(); //accepts user input
            
            System.out.printf("Enter an arithmetic operator (+,-,/,or *): "); //prompts user to enter an arithmetic operator
            char operator = myScanner.next().charAt(0); //tells to take first character (charAt takes first character in String)

            
                    switch (operator) { //create a switch statement using the operator char
                    
                        case '+' : System.out.println(a+b); //if you entered a +, it will do an addition
                        break;
                    
                        case '-' : System.out.println(a-b); //if you entered a -, it will do a subtraction
                        break;
                    
                        case '*' : System.out.println(a*b); //if you enter a *, it will do a multiplication
                        break;
                    
                        case '/' : System.out.println((double)a/(double)b); //if you entered a /, it will do a division
                        break;
                    
                        default: System.out.println("Illegal Operator!"); //if you did not entered one of the four above operators, it will print Illegal Operator!
                        } //close switch statement
        
    } //close main method
    } //close class
