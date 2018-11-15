
/*Problem Set - For Loops
 * Tahmid Chowdhury
 * 10/15/2018
 * 
 */

import java.util.Scanner;

public class ForLoops_TahmidChowdhury {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Asks user for a number and prints 0 to their number
		System.out.print("Enter your favourite number: ");
		int number = sc.nextInt();
		
		for (int rounds = 0; rounds != (number + 1); rounds = rounds + 1)
		{
			System.out.print("\n" + rounds);
		}
		
		//Asks the user for  for two positive integers and outputs all values between 0 and the first number that are divisible by the second number
		System.out.print("Enter a positive number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter another positive number: ");
		int secondNumber = sc.nextInt();
		
		for (int rounds = 0; rounds <= firstNumber; rounds = rounds + 1)
		{
			if (rounds % secondNumber == 0)
			{
				System.out.print("\n" + rounds);
			}
		}
		
		//Asks user for a word, outputs the word, quits when the word is 'q'
		for (String word = ""; !word.equals("q");)
		{
			System.out.print("Enter a word: ");
			word = sc.nextLine();
			if (word.equals("q"))
			{
				break;
			}
			else
			{
				System.out.print(word + "\n");
			}
		}
		
		sc.close();
	}

}
