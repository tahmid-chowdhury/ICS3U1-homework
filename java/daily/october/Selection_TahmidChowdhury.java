
/*If-Statement Assignment
 * Tahmid Chowdhury
 * 10/06/2018
 * 
 */

import java.util.Scanner;

public class Selection_TahmidChowdhury {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Asks the user for two numbers and compares them
		System.out.print("Enter a number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter another number: ");
		int secondNumber = sc.nextInt();
		
		if (firstNumber > secondNumber)
		{
			System.out.print(firstNumber + " > " + secondNumber);
		}
		else if (firstNumber < secondNumber)
		{
			System.out.print(firstNumber + " < " + secondNumber);
		}
		else if (firstNumber == secondNumber)
		{
			System.out.print(firstNumber + " = " + secondNumber);
		}
		
		//Asks the user for three numbers and outputs them from least to greatest
		System.out.print("Please enter three unique numbers:\nEnter the first number: ");
		int firstNumber1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber1 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int thirdNumber = sc.nextInt();
		
		if (firstNumber1 < secondNumber1)
		{
			if (firstNumber1 < thirdNumber)
			{
				if (secondNumber1 < thirdNumber)
				{
					System.out.print(firstNumber1 + " < " + secondNumber1 + " < " + thirdNumber);
				}
				else if (secondNumber1 > thirdNumber)
				{
					System.out.print(firstNumber1 + " < " + thirdNumber + " < " + secondNumber1);
				}
			}
			else if (firstNumber1 > thirdNumber)
			{
				System.out.print(thirdNumber + " < " + firstNumber1 + " < " + secondNumber1);
			}
		}
		else if (firstNumber1 > secondNumber1)
		{
			if (firstNumber1 < thirdNumber)
			{
				System.out.print(secondNumber1 + " < " + firstNumber1 + " < " + thirdNumber);
			}
			else if (firstNumber1 > thirdNumber)
			{
				if (secondNumber1 < thirdNumber)
				{
					System.out.print(secondNumber1 + " < " + thirdNumber + " < " + firstNumber1);
				}
				else if (secondNumber1 > thirdNumber)
				{
					System.out.print(thirdNumber + " < " + firstNumber1 + " < " + firstNumber1);
				}
			}
		}
		
		//Asks the user for two numbers and an operation and outputs the answer
		System.out.print("Enter a number: ");
		int firstInteger = sc.nextInt();
		System.out.print("Enter another number: ");
		int secondInteger = sc.nextInt();
		System.out.print("Enter an operation (\"+\", \"-\", \"*\", \"/\"): ");
		char operation = sc.next().charAt(0);
		
		if (operation == '+')
		{
			System.out.print(firstInteger + " + " + secondInteger + " = " + (firstInteger + secondInteger));
		}
		else if (operation == '-')
		{
			System.out.print(firstInteger + " - " + secondInteger + " = " + (firstInteger - secondInteger));
		}
		else if (operation == '*')
		{
			System.out.print(firstInteger + " * " + secondInteger + " = " + (firstInteger * secondInteger));
		}
		else if (operation == '/')
		{
			System.out.print(firstInteger + " / " + secondInteger + " = " + (firstInteger / secondInteger));
		}
		
		//Asks the user to guess heads or tails, flips a coin, and tells user whether they were correct
		System.out.print("Heads or tails?: ");
		String guess = sc.nextLine();
		if (guess.equals("heads"))
		{
			System.out.print("You guessed heads!");
		}
		else if (guess.equals("tails"))
		{
			System.out.print("You guessed tails!");
		}
		else
		{
			System.out.print("Invalid input");
			System.exit(0);
		}
		
		int coinFlip = (int) (Math.random() * 2) + 1;
		
		if (coinFlip == 1)
		{
			System.out.print("Its heads!");
			if (guess.equals("heads"))
			{
				System.out.print("\nYou were right!");
			}
			else if (guess.equals("tails"))
			{
				System.out.print("\nYou were wrong!");
			}
		}
		else if (coinFlip == 2)
		{
			System.out.print("Its tails!");
			if (guess.equals("heads"))
			{
				System.out.print("\nYou were wrong!");
			}
			else if (guess.equals("tails"))
			{
				System.out.print("\nYou were right!");
			}
		}

		//Generates a random math problem and asks the user to solve it, then tells them whether they were correct
		int firstNumber2 = (int) (Math.random() * 100) + 1;
		int secondNumber2 = (int) (Math.random() * 100) + 1;
		int operationNumber = (int) (Math.random() * 4) + 1;
		
		if (operationNumber == 1)
		{
			int answer = (firstNumber2 + secondNumber2);
			
			System.out.print("What is " + firstNumber2 + " + " + secondNumber2 + "?: ");
			int input = sc.nextInt();
			
			if (input == answer)
			{
				System.out.print("Correct!");
			}
			else
			{
				System.out.print("Wrong! The correct answer is " + answer);
			}
		}
		else if (operationNumber == 2)
		{
			int answer = (firstNumber2 - secondNumber2);
			
			System.out.print("What is " + firstNumber2 + " - " + secondNumber2 + "?: ");
			int input = sc.nextInt();
			
			if (input == answer)
			{
				System.out.print("Correct!");
			}
			else
			{
				System.out.print("Wrong! The correct answer is " + answer);
			}
		}
		else if (operationNumber == 3)
		{
			int answer = (firstNumber2 * secondNumber2);
			
			System.out.print("What is " + firstNumber2 + " * " + secondNumber2 + "?: ");
			int input = sc.nextInt();
			
			if (input == answer)
			{
				System.out.print("Correct!");
			}
			else
			{
				System.out.print("Wrong! The correct answer is " + answer);
			}
		}
		else if (operationNumber == 4)
		{
			double answer = (firstNumber2 / secondNumber2);
			
			System.out.print("What is " + firstNumber2 + " / " + secondNumber2 + "?: ");
			int input = sc.nextInt();
			
			if (input == answer)
			{
				System.out.print("Correct!");
			}
			else
			{
				System.out.print("Wrong! The correct answer is ");
				System.out.printf("%.2f", answer);
			}
		}
		

		sc.close();
	}

}
