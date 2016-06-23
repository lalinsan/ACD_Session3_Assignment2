/*
* Student: Eduardo Aguirre
* Session 3
* Assignment 2
* Java program that simple Java program to check whether a given number is a prime number or not
*/

import java.util.Scanner; //Imports Scanner Class from java API Class Library


public class CheckPrimeNumbers {

	public static void main(String[] args) { //Main Method to call to start the Program
		int num1; //Variable to store the Prime Number calculation num2%i
		boolean isPrimeNumber=true; //Variable that indicates is the Number is a Prime Number
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an Instance if of Scanner Object to take user's input
		
		String choice = "Y"; //Variable to store the user's choice to run the App.
		while (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes")) //Executes code as long as the User's choice = Y or Yes
		{
			System.out.println("====================================");
			System.out.println("Welcome to check Prime Number App"); //Initial Welcome Message
			System.out.print("Is this a Prime Number: ? "); //Prompts user to enter a number
			int num2 = sc.nextInt(); //Stores the number to be validated
			
			for (int i=2; i<=num2/2;i++) //Loop to validate Prime Number
			{
				num1=num2%i; //Calculates if it is a Prime Number
				if(num1==0)
				{
					isPrimeNumber=false; //Sets the variable isPrimeNumber to False
					break; //Stops the Loop
				}
			}
			
			if (isPrimeNumber)
				//Prints the entered number is a Prime Number if the isPrimeNumber is true
				System.out.println("The number you entered" +" "+num2 + " is a \"Prime Number\""); 
			
			else
				//Prints the entered number is a Prime Number if the isPrimeNumber is false
				System.out.println("The number you entered" +" "+num2 + " is not a \"Prime Number\"");
			
			System.out.print("Do you want to try another number (Y|N) ? "); //Prompts user to enter another number
            choice = sc.next(); //Stores User's selection
			
		}
		System.out.println("Thanks for using Prime Number Check App "); //Exit message when the user does not want to try again
		System.out.println("=========================================");
	}

}

