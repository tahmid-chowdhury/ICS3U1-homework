
/* 
 * Tahmid Chowdhury
 * 11/13/2018
 * Triangles Assignment
 */

import java.util.Scanner;

public class Assignment_Triangles {

	//'main' class
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = 1;
		int b = 1;
		int c = 1;
		
		while (a != 0 && b != 0 && c != 0) {
			System.out.println("Provide three side lengths – 0 0 0 to terminate.");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (possible(a, b, c) == " Triangle possible: ")
			{
				System.out.println(a + " " + b + " " + c + possible(a, b, c) + sideClass(a, b, c) + angleClass(a, b, c));
			}
			else if (a == 0 && b == 0 && c == 0)
			{
				break;
			}
			else
			{
				System.out.println(a + " " + b + " " + c + possible(a, b, c));
			}
		}
		
		System.out.println("0 0 0 Program was terminated by user.");

		sc.close();
	}
	
	//checks the triangles angle classification
	public static String sideClass(int a, int b, int c) {
		if (a == b && a == c && b == c)
		{
			return "equilateral";
		}
		else if (a != b && a != c && b!= c)
		{
			return "scalene and";
		}
		else
		{
			return "isosceles and";
		}
	}
	
	//checks the triangles angle classification
	public static String angleClass(int a, int b, int c) {
		if (Math.abs(a * a + b * b - c * c) < 0.2)
		{
			return " right.";
		}
		else if (Math.abs(a * a + c * c - b * b) < 0.2)
		{
			return " right.";
		}
		else if (Math.abs(c * c + b * b - a * a) < 0.2)
		{
			return " right.";
		}
		else if (Math.cos(a) == Math.cos(b) && Math.cos(a) == Math.cos(c) && Math.cos(b) == Math.cos(c))
		{
			return ".";
		}
		else if (Math.cos(a) < 90 || Math.cos(b) < 90 || Math.cos(c) < 90)
		{
			return " acute.";
		}
		else
		{
			return " obtuse.";
		}
	}
	
	//checks whether the triangle is possible
	public static String possible(int a, int b, int c ) {
		if (a + b > c && a + c > b && b + c > a)
		{
			return " Triangle possible: ";
		}
		else
		{
			return " Triangle cannot be formed. ";
		}
	}

}
