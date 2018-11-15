import java.util.Scanner;

public class Parameters {

	//takes two integers and swaps their values
	public static void swap(int m, int n) {
		
		int temp = m;
		m = n;
		n = temp;

	}
	
	//this method will output "i = 3 and j = 7"
	public static void main(String[] args) {
		
		int i = 7;
		int j = 3;
		swap(i, j);
		System.out.println("i = " + i + " and j = " + j);
		/*this program did not output what i expected it to*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times would you like to roll the dice?: ");
		int rolls = sc.nextInt();
		int rollNumber = 1;
		while (rollNumber != rolls + 1)
		{
			System.out.print("Roll " + rollNumber + " is a ");
			rollDice(rollNumber);
			System.out.print(".\n");
			rollNumber += 1;
		}
		
		
		System.out.println("Enter a character: ");
		char character = sc.next().charAt(0);
		
		System.out.println("Enter a height: ");
		int height = sc.nextInt();
		
		System.out.println("Enter a width: ");
		int width = sc.nextInt();
		
		sc.close();
		
		printRect(character, width, height);
	}

	public static void rollDice(int numTimes) {

		int roll;
		roll = (int) (Math.random() * 6) + 1;
		System.out.print(roll);
		
	}

	public static void printRect (char c, int width, int height) {
		
		for (int i = 0; i < height; ++i) 
		{ 
		for (int j = 0; j < width; ++j)
		{
			System.out.print(c); 
		}
		System.out.println(); 
		} 
		
	}
	
}
