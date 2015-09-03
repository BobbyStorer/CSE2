//Robert Storer
//September 3, 2015
//CSE 002 Lab 2
//Professor Fouh

//Objective: To gain experience using variables to make basic computations in java.
//I will write a code that takes the time and bicylce rotation counts from two theoretical cycling workouts 
//and will print the total distance of each trip and the trips combined.

//define a class
public class Cyclometer {
    
    //add main method
    public static void main (String [] args) {
        
        //create variables for the data recorded for each trip (elapsed time, rotation counts)
        int secsTrip1 = 480;
        int secsTrip2 = 3220;
        int countsTrip1 = 1561;
        int countsTrip2 = 9037;
        
        //Now, create secondary variables that will be used to help convert our recorded data into total miles
        double wheelDiameter = 27.0,
               PI = 3.14159,
               feetPerMile = 5280,
               inchesPerFoot = 12,
               secondsPerMinute = 60;
               //The comma method of declaring and assigning variables above can be used if the variables you are creating are of the same type.
               
        //The variables below will be the final variables we print to get our solution. I chose not to use the comma method so I could clearly distinguish between the three.
        double distanceTrip1;
        double distanceTrip2;
        double totalDistance;
        
            //Next, I'll print statements that tell you how many minutes each trip took and how many counts.
            System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
            System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
            
            //Now, assign values to the totalDistance variables using the secondary variables to help convert to miles
            distanceTrip1 = (countsTrip1*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
            distanceTrip2 = (countsTrip2*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
            totalDistance = distanceTrip1+distanceTrip2;
            
                //Print out the final distances
                System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
                System.out.println("Trip 2 was " + distanceTrip2 + " miles."); 
                System.out.println("The total distance was " + totalDistance + " miles.");
               
        
    } //end of main method
} //end of class
