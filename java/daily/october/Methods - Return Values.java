
public class ReturnValues {
	
	//Question 1a
	public static int randomNumber() {
		int roll = (int) (Math.random() * 6) + 1;
		return roll;
	}
	
	//Question 1b
	public static int randomNumber2(int high) {
		int roll = (int) (Math.random() * high) + 1;
		return roll;
	}
	
	//Question 1c
	public static int randomNumber3(int min, int max) {
		int roll = (int) (Math.random() * max) + min;
		return roll;
	}

	//Question 1d
	public static String randomNumber4(int min, int max, int step) {
		int roll = (int) (Math.random() * max) + min;
		int number = min;
		String value = "";
		while (number != roll)
		{
			value += number + ", ";
			number += step;
		}
		value += "\n" + roll;
		return value;
	}
	
	//Question 2
		//"mystery" is the identifier of this method
		//"a" and "b" are the parameters
	public static int mystery(double a, double b) {
		int value = 0;
		if (a < b)
		{
			value = -1;
		}
		if (a > b)
		{
			value = 1;
		}
		//returns an integer
		return value;
	}
	
	//Question 2d
	public static int mystery2(double a, double b) {
		int value = 0;
		if (a < b)
		{
			value = -1;
		}
		else
		{
			value = 1;
		}
		return value;
	}
	
	//Question 2e
	public static int mystery3(double a, double b) {
		if (a < b)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
	//Question 3
	public static double f(double x) {
		double y;
		if (x < 0)
		{
			y = x * x;
		}
		else
		{
			y = x * x * x;
		}
		return y;
	}

	/*
	 * 3. a) This is valid because the double value that is returned by the method is called in a print statement
	 * 	  b) This is valid because it establishes a new double variable that is equal to the method called
	 * 	  c) This is invalid because it tries to establish a new double variable that is equal to a print statement
	 * 	  d) This is valid because it establishes a new double variable that is equal to -7, then calls the method with the variable
	*/
	
	//Question 4
	public static double largest(double a, double b, double c) {
		if (a > b && a > c)
		{
			return a;
		}
		else if (b > a && b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	//Question 5
	public static int gcd(int a, int b) {
		int divisor = 0;
		for (int divide = 2; divide > a && divide > b; ++divide)
		{
			if (a % divide == 0 && b % divide == 0)
			{
				divisor = divide;
			}
		}
		return divisor;
	}
	
	//Question 6
	public static boolean isDivisible(int a, int b) {
		boolean x = false;
		if (a % b == 0)
		{
			x = true;
		}
		return x;
	}
	
	//Question 7
	public static boolean isPrime(int x) {
		boolean y = false;
		for (int z = 2; z == x; ++z)
		{
			if (x % z == 0)
			{
				y = true;
			}
		}
		return y;
	}
	
	//Question 8
	public static boolean isLetter(char x) {
		boolean y = false;
		if (x > 'a' && x < 'Z')
		{
			y = true;
		}
		return y;
	}
	
}
