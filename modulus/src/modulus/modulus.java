package modulus;

import java.util.Scanner;



public class modulus
	{
public static void main(String[] args)
	{
	Scanner userInput = new Scanner (System.in);	
	System.out.println("Give me a number");
	int number = userInput.nextInt();
	
		if (number % 2 == 1);
			{
			System.out.println("Your number is odd");
			}
		else 
				{
				System.out.println("Your number is Even");
			}
	
	}
}