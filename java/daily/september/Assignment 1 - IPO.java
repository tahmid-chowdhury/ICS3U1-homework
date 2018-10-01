import java.util.Scanner;

/*Assignment 1 - IPO
 * Tahmid Chowdhury
 * 9/28/2018
 * 
 */
public class IPO_TahmidChowdhury {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Asks and outputs favourite class and grade earned
		System.out.print("What was your favourite class from last year?: ");
		String subject = sc.nextLine();

		System.out.print("What grade did you earn in it?: ");
		int grade = sc.nextInt();

		System.out.println("\nWow, you got a " + grade + " in " + subject + "?!");

		
		//Asks and outputs sum of first three numbers times fourth number
		System.out.print("Enter a number: ");
		int first = sc.nextInt();

		System.out.print("Enter a second number: ");
		int second = sc.nextInt();

		System.out.print("Enter a third number: ");
		int third = sc.nextInt();

		System.out.print("Enter a fourth number: ");
		int fourth = sc.nextInt();

		int answer = ( first + second + third) * fourth;

		System.out.println("\n( " + first + " + " + second + " + " + third + " ) * " + fourth + " = " + answer);
		
		
		//Asks user for name, address, and number of each item ordered and prints an invoice
		String storeName = "Mrs. Baf's Flying Discs";
		String storeAddress = "175 Graham Street";

		System.out.print("Enter the name of the customer: ");
		String customerName = sc.nextLine();

		System.out.print("Enter the address of the customer: ");
		String customerAddress = sc.nextLine();

		String item1Name = "Custom Frisbees";
		String item2Name = "Misprinted Frisbees";

		System.out.print("Enter the number of '" + item1Name + "' ordered: ");
		int quantityCustom = sc.nextInt();

		System.out.print("Enter the number of '" + item2Name + "' ordered: ");
		int quantityMisprint = sc.nextInt();

		int quantityTotal = quantityCustom + quantityMisprint;

		double item1Price = 15 * quantityCustom;
		double item2Price = 8 * quantityMisprint;
		double discount = 0.1 * ( item1Price + item2Price );

		double subtotal = item1Price + item2Price - discount;
		double hst = 0.13 * subtotal;
		double total = subtotal + hst;

		System.out.print("\nINVOICE\n" + storeName + " | " + storeAddress + "\n\nBILL TO\n" + customerName + " | " + customerAddress + "\n\nDESCRIPTION				AMOUNT" + "\n" + item1Name + "				$15 x " + quantityCustom + " = $" );
		System.out.printf("%.2f", item1Price);
		System.out.print("\n" + item2Name + "			$8 x " + quantityMisprint + " = $");
		System.out.printf("%.2f", item2Price);
		System.out.print("\n\nTOTAL | " + quantityTotal + " items = $");
		System.out.printf("%.2f", item1Price);
		System.out.print(" + $");
		System.out.printf("%.2f", item2Price);
		System.out.print(" = $");
		System.out.printf("%.2f", item1Price + item2Price);
		System.out.print("\nDISCOUNT | $");
		System.out.printf("%.2f", discount);
		System.out.print("\nSUBTOTAL | $");
		System.out.printf("%.2f", subtotal);
		System.out.print("\nTAX | $");
		System.out.printf("%.2f", hst);
		System.out.print("\nTOTAL | $");
		System.out.printf("%.2f", total);
		
		sc.close();
		
	}

}
