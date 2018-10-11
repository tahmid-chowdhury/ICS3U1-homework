
/*While Loops Problem Set
 * Tahmid Chowdhury
 * 10/10/2018
 * 
 */

import java.util.Scanner;

public class While_TahmidChowdhury {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Constantly asks user for favourite number, ends loop when user enters '1337'
		System.out.print("Enter your favourite number: ");
		int favouriteNumber = sc.nextInt();
		
		while (favouriteNumber != 1337)
		{
			System.out.print("Enter your favourite number: ");
			favouriteNumber = sc.nextInt();
		}
		
		System.out.print("Wow!");
		
		//Constantly asks user for numbers, ends loop when user enters '-1', then states the average of the numbers entered
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		int total = 0;
		int rounds = 0;
		
		while (input != -1)
		{
			total = total + input;
			rounds = rounds + 1;
			System.out.print("Enter another number: ");
			input = sc.nextInt();
		}
		
		System.out.print("The sum of the " + rounds +" numbers is " + total + ". The average of these numbers is " + (total / rounds));

		//Constantly asks the user for words, ends loop when user enters '.', then prints all the words entered in one line
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		String line = "";
		
		while (!word.equals("."))
		{
			line = line + " " + word;
			System.out.print("Enter another word: ");
			word = sc.nextLine();
		}
		
		System.out.print("Output: \"" + line + " \"");

		//Constantly asks the user to enter positive numbers, then states whether the number is even or odd, ends loop when user enters '0'
		System.out.print("Enter a positive number: ");
		int number = sc.nextInt();
		
		while (number != 0)
		{
			if (number > 0)
			{
				int remainder = number % 2;
				if (remainder == 0)
				{
					System.out.print("\"" + number + "\" is even");
				}
				else
				{
					System.out.print("\"" + number + "\" is odd");
				}
				System.out.print("\nEnter another positive number: ");
				number = sc.nextInt();
			}
			else if (number < 0)
			{
				System.out.print("The number entered was not positive.");
				System.out.print("\nEnter another positive number: ");
				number = sc.nextInt();
			}
		}
		
		sc.close();
	}

}
