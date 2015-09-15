//Robert W Storer
//CSE002 HW Assignment 3
//Block Program
//Septemeber 15, 2015
//Professor Fouh

//Goal: This program will prompt a user to enter the dimensions of a cube.
//the program will print the block's volume and surface area.

import java.util.Scanner; //import scanner class

    public class Block {  //add class
    public static void main (String [] args) {  //add main method 
        
        Scanner myScanner = new Scanner(System.in); //create an instance of the Scanner class
        
            System.out.printf("What is the height of the cube? : ");
            double height = myScanner.nextDouble();
        
            System.out.printf("What is the length of the cube? : ");
            double length = myScanner.nextDouble();
        
            System.out.printf("What is the width of the cube? : ");
            double width = myScanner.nextDouble();
            
                double cubeVolume = (height*length*width);
                double surfaceArea = ((2*height*length) + (2*height*width) + (2*length*width));
                
                    System.out.println("The cube's volume is: " + cubeVolume);
                    System.out.println("The cube's surafce area is: " + surfaceArea);
                
        
    }
    }