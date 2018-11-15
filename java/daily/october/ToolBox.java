
import java.util.Scanner;

public class ToolBox {

	public static int rollDice() {
		int roll = (int) (Math.random() * 6) + 1;
        return roll;
	}
	
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int integer = sc.nextInt();
		sc.close();
		return integer;
	}
	
	public static double getDouble() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		double decimal = sc.nextDouble();
		sc.close();
		return decimal;
	}
	
	public static String getString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		sc.close();
		return word;
	}
	
	public static void getUserInput() {
		if ((rollDice() % 1) == 0)
		{
			getInt();
		}
		else if ((rollDice() % 1) != 0)
		{
			getDouble();
		}
		else
		{
			getString();
		}
	}
	
	public static void main(String[] args) {
		int guess = getInt();
		int roll = rollDice();
		System.out.println("The dice rolled " + roll);
		if (guess != roll)
		{
			System.out.println("Incorrect!");
		}
		else
		{
			System.out.println("Correct!");
		}
	}

}
