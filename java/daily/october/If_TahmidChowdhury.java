
import java.util.Scanner;

/*Problem Set - If Statements
 * Tahmid Chowdhury
 * 10/01/2018
 * 
 */
public class If_TahmidChowdhury {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Asks user for percentage grade and outputs letter grade
		System.out.println("What is your percentage grade?: ");
		int percentage = sc.nextInt();

		if (percentage >= 80)
		{
			System.out.println("Wow! You got an 'A'!");
		}
		else if (percentage >= 70) {
				if (percentage <= 79) {
					System.out.println("Good job! You got a 'B'!");
				}
		}
		else if (percentage >= 60) {
			if (percentage <= 69) {
				System.out.println("Keep trying! You got a 'C'!");
			}
		}
		else if (percentage >= 50) {
			if (percentage <= 59) {
				System.out.println("Try harder! You got a 'D'!");
			}
		}
		else if (percentage <= 49) {
			System.out.println("Try trying! You got an 'F'!");
		}


		//Asks user a true or false question and provides answer
		System.out.println("Quick! True or False?; The giant panda is classified as an \"endangered\" species: ");
		boolean answer = sc.nextBoolean();

		if (answer == true)
		{
			System.out.println("Wrong! In 2016, the IUCN reclassified the species from \"endangered\" to \"vulnerable\".");
		}
		else if (answer == false)
		{
			System.out.println("Correct! In 2016, the IUCN reclassified the species from \"endangered\" to \"vulnerable\".");
		}

		
		//Asks user for length and width of a rectangle and outputs area if possible, otherwise it exits
		System.out.println("Enter the length of a rectangle: ");
		int length = sc.nextInt();
		System.out.println("Enter the width of a rectangle: ");
		int width = sc.nextInt();
		
		if (length <= 0)
		{
			if (width <=0)
			{
				System.out.println("Invalid input for length and width");
				System.exit(0);
			}
			else if (width >= 0)
			{
				System.out.println("Invalid input for length");
				System.exit(0);
			}
		}
		else if (length >= 0)
		{
			if (width <= 0)
			{
				System.out.println("Invalid input for width");
				System.exit(0);
			}
			else if (width >= 0)
			{
				System.out.println("Area of Rectangle = " + length * width);
			}
		}
		
		
		//Asks user for mood and provides feedback, then wishes user a great day tomorrow
		System.out.println("How are you feeling today?: ");
		String mood = sc.nextLine();
		
		if (mood.equals("great"))
		{
			System.out.println("Great!");
		}
		else if (mood.equals("good"))
		{
			System.out.println("Good!");
		}
		else if (mood.equals("okay"))
		{
			System.out.println("Okay!");
		}
		else if (mood.equals("terrible"))
		{
			System.out.println("Oh...");
		}
		else
		{
			System.out.println("Invalid input, try entering \"great\", \"good\", \"okay\", or \"terrible\"");
		}
		
		System.out.println("Have a great day tomorrow!");
		
		sc.close();
	}

}
