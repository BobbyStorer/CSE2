//Robert W. Storer
//CSE002 HW Assignment 2
//Walmart Purchases
//Tuesday, September 8, 2015

//First, define class
public class Arithmetic {
    
    //add main method
    public static void main (String [] args){
        
        //declare and assign variables
        int numberSocks=3; //number of socks purchased
        double perSock$=2.58; //price per sock
        int numberGlasses=6; //number of glasses purchased
        double perGlass$=2.29; //price per glass
        int numberEnvelopes=1; //number of boxes of envelopes purchased
        double perEnvelope$=3.25; //cost per box of envelopes
        
        double salesTax=0.06; //tax percentage as a decimal for arithmetic purposes
        
            //Now, I'll declare and assign variables using the variables created above.
            double sockCost = numberSocks*perSock$; //before tax cost of socks
            double sockTax = sockCost*salesTax; //tax on sock purchase
            int sockTax2 = (int) (sockTax*100);
            // int taxTotal = (int) sockTax3*100;
            
            double glassesCost = numberGlasses*perGlass$; //before tax cost of glasses
            double glassesTax = glassesCost*salesTax; //tax on glasses purchase
            int glassesTax2 = (int) (glassesTax*100);
        
            double envelopeCost = numberEnvelopes*perEnvelope$; //before tax cost of envelopes
            double envelopeTax = envelopeCost*salesTax; //tax on envelope purchase
            int envelopeTax2 = (int) (envelopeTax*100);
            
            double pretaxTotal = sockCost+glassesCost+envelopeCost; //pretax total cost of the shopping trip
            double totalTax = (sockTax2/100.0)+(glassesTax2/100.0)+(envelopeTax2/100.0);
            double aftertaxTotal= pretaxTotal+totalTax; //after tax total cost of the shopping trip
            
                //Finally, I'll print out all of my results.
                System.out.println("Socks");
                System.out.println("Number Bought: " + numberSocks);
                System.out.println("Cost per Pair: $" + perSock$);
                System.out.println("Before Tax Cost of Socks: $" + sockCost);
                System.out.println("Sales Tax on Socks: $" + (sockTax2/100.0));
                
                System.out.println(""); //I included this to leave space between the info about each item so it is easier to see
                
                System.out.println("Glasses");
                System.out.println("Number Bought: " + numberGlasses);
                System.out.println("Cost per Glass: $" + perGlass$);
                System.out.println("Before Tax Cost of Glasses: $" + glassesCost);
                System.out.println("Sales Tax on Glasses: $" + (glassesTax2/100.0));
                
                System.out.println("");
                 
                System.out.println("Envelopes");
                System.out.println("Number of Boxes Bought: " + numberEnvelopes);
                System.out.println("Cost per Box: $" + perEnvelope$);
                System.out.println("Before Tax Cost of Envelopes: $" + envelopeCost);
                System.out.println("Sales Tax on Envelopes: $" + (envelopeTax2/100.0));
                
                System.out.println("");
                 
                System.out.println("Before Tax Total Cost: $" + pretaxTotal);
                System.out.println("Total Sales Tax: $" + totalTax);
                System.out.println("After Tax Total Cost: $" + aftertaxTotal);
        
        
    } //close main method
} //close class