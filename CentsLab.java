/*
Write a program that gives the exact change with the least number of coins for a given number of cents.  

Example: 137 cents: 5 quarters, 1 dimes, 0 nickels, 2 pennies
Example: 50 cents should output:  2 quarters, 0 dimes, 0 nickels, 0 pennies

*/

public class CentsLab {
  
   public static void main(String [] args) {
   
      int totalCents = 137; //change this number to test various values.  
       //calculate the num of quarters 
      int numQuarters = totalCents / 25;
      int remainingCents = totalCents % 25; 

      //calculate dimes
      int numDimes = remainingCents /  10; 
      remainingCents = remainingCents % 10; 

      //calculate nickels
      int numNickels = remainingCents / 5;
      remainingCents = remainingCents % 5; 

      //calculate pennies
      int numPennies = remainingCents; 

      System.out.println(totalCents + " cents is: \n\t" + numQuarters + " quarters \n\t" + numDimes + " dimes \n\t" + numNickels + " nickels \n\t" + numPennies + " pennies");

   
   }

}
