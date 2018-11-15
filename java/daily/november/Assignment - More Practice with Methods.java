/*
 * Assignment - More Practice with Methods
 * Tahmid Chowdhury
 * 11/15/2018
 */


import java.util.Scanner;

public class MethodsPractice {

	//runs methods
	public static void main(String[] args) {
		largest(2.4, 6.4, 4.9);
		LCM(24, 12);
		date();
	}
	
	//returns largest 'double'
	public static double largest(double a, double b, double c) {
		if (a > b && a > c)
		{
			return a;
		}
		else if (a > b && a < c)
		{
			return c;
		}
		else
		{
			return b;
		}
	}
	
	//returns largest common multiple
	public static int LCM(int m, int n) {
		int lcm = 0, max, step;
		
		if (m > n)
		{
			max = step = m;
	    }
	    else
	    {
	        max = step = n;
	    }

	    while(m!= 0) {
	        if(max % m == 0 && max % n == 0) {
	        	lcm = max;
	            break;
	        }
	        max += step;
	    }
	    return lcm;
	}

	//compares dates
	public static void date() {
		Scanner sc = new Scanner (System.in);
		
		int day1 = 0;
		int month1 = 0;
		int day2 = 0;
		int month2 = 0;
		String result;
		
		while (day1 > 31 && day1 < 1)
		{
			System.out.println("Enter today's date in numbers");
			day1 = sc.nextInt();
			if (day1 > 31 && day1 < 1)
			{
				break;
			}
			System.out.println("Try again...");
		}
		
		while (month1 > 12 && month1 < 1)
		{
			System.out.println("Enter the month in numbers");
			month1 = sc.nextInt();
			if (month1 > 12 && month1 < 1)
			{
				break;
			}
			System.out.println("Try again...");
		}
		
		while (day2 > 31 && day2 < 1)
		{
			System.out.println("Enter today's date in numbers");
			day2 = sc.nextInt();
			if (day2 > 31 && day2 < 1)
			{
				break;
			}
			System.out.println("Try again...");
		}
		
		while (month2 > 12 && month2 < 1)
		{
			System.out.println("Enter the month in numbers");
			month2 = sc.nextInt();
			if (month2 > 12 && month2 < 1)
			{
				break;
			}
			System.out.println("Try again...");
		}
		
		if (month1 > month2)
		{
			result = "after";
		}
		else if (month1 < month2)
		{
			result = "before";
		}
		else
		{
			if (day1 > day2)
			{
				result = "after";
			}
			else if (day1 < day2)
			{
				result = "before";
			}
			else
			{
				result = "coincident";
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
}
