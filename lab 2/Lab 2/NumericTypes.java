/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2;// number of scores
		System.out.println("Please enter the first score: ");
		int score1 = user.nextInt(); // first test score
		System.out.println("Please enter the second score: ");
		int score2 = user.nextInt(); // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Please enter Farenheit: ");
		double tempUser = user.nextDouble();
		fToC = (5.0/9.0) * (tempUser - 32);
		output = tempUser + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
	}
	}
