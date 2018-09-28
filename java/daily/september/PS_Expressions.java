/*PS_Expressions
 * Tahmid Chowdhury
 * 9/23/2018
 * 
 */
public class Expressions_TahmidChowdhury {

	public static void main(String[] args) {
		
		//Outputs 10 to 0
		int a = 10;
		System.out.print(a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + ", " + a-- + "\n\n\n");

		//Outputs '1 2 4 8 16 32'
		int b = 1;
		System.out.print(b++ + "  " + b++ + "  " + ++b + "  ");
		b = b + b;
		System.out.print(b++ + "  ");
		b = b + --b;
		System.out.print(--b + "  ");
		b = b + b;
		System.out.print(b + "\n\n\n");

		//Outputs '1 5 6 3 9 10 6 1'
		int c = 1;
		System.out.print(c++ + "  ");
		c = c + ++c;
		System.out.print(c + "  ");
		System.out.print(++c + "  ");
		c = --c + --c - --c - --c - --c - --c + --c;
		System.out.print(++c + "  ");
		c = ++c + ++c;
		System.out.print(c + "  " + ++c + "  ");
		c = c + c + --c - --c - --c - --c - --c;
		c = c-- + ++c;
		System.out.print(c + "  ");
		c = ++c - --c;
		System.out.println(c + "\n\n\n");

		//Outputs '1 2 4 7 11 16'
		int d = 1;
		System.out.print(d++ + "  ");
		System.out.print(d++ + "  ");
		System.out.print(++d + "  ");
		d = --d + ++d;
		System.out.print(d + "  ");
		d = --d + d;
		System.out.print(--d + "  ");
		d = --d + --d - d + --d - d + --d;
		System.out.print(--d + "\n\n\n");


		//Declares variables for next program
		double myRandom = (double) (Math.random()*100)+1;
		int convertRandom = (int)(Math.ceil(myRandom*100));
		int toonies = Math.round((int)convertRandom/200);
		convertRandom=convertRandom%200;
		int loonies = Math.round((int)convertRandom/100);
		convertRandom=convertRandom%100;
		int quarters = Math.round((int)convertRandom/25);
		convertRandom=convertRandom%25;
		int dimes = Math.round((int)convertRandom/10);
		convertRandom=convertRandom%10;
		int nickels = Math.round((int)convertRandom/5);
		convertRandom=convertRandom%5;
		int pennies = Math.round((int)convertRandom);

		//Generates random amount of money and divides it into coins
		System.out.print("$");
		System.out.printf("%.2f %n", myRandom);
		System.out.print("\ntoonies: ");
		System.out.print(toonies);
		System.out.print("\nloonies: ");
		System.out.print(loonies);
		System.out.print("\nquarters: ");
		System.out.print(quarters);
		System.out.print("\ndimes: ");
		System.out.print(dimes);
		System.out.print("\nnickels: ");
		System.out.print(nickels);
		System.out.print("\npennies: ");
		System.out.print(pennies);
		
	}

}
