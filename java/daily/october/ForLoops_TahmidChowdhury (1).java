
import java.util.Scanner;

public class ForLoops_TahmidChowdhury {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//
		for (int x = 3; x != (3 * 31); x = x + 3)
		{
			System.out.println(x);
		}

		//
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		
		for (int m = 1; m != 13; m = m + 1)
		{
			System.out.println(n * m);
		}
		
		//
		boolean isPrime = true;
		int q;
		
		System.out.println("Enter an integer: ");
		int p = sc.nextInt();
		
		for (int i = 2; i <= p / 2; i++)
		{
			q = p % i;
			if (q == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(p + " is a prime number");
		}
		else
		{
			System.out.println(p + " is not a prime number");
		}
		
		//
		String  primeNumbers = "";
		
		System.out.println("Enter an integer:");
		int u = sc.nextInt();
		
	    for (int i = 1; i <= u; i++)
	    {
	    	int counter = 0; 	
	    	for(int num = i; num >= 1; num--)
	    	{
	    		if(i % num == 0)
	    		{
	    			counter = counter + 1;
	    		}
	    	}
	    	if (counter == 2)
	    	{
	    		primeNumbers = primeNumbers + i + " ";
	    	}	
	    }	
	    System.out.println("Prime numbers from 1 to " + u + " are:");
	    System.out.println(primeNumbers);
		
		sc.close();
	}
	
	public static void main2(String args[]) {
		
		for (int i = 2; i <= 10000; i++)
		{
			for (int j = i + 1; j <= 10000; j++)
			{
				if (facSum(i) == j && facSum(j) == i)
				{
					System.out.println(i + " and " + j + " are amicable!");
				}
			}
		}
	}
	public static int facSum(int a) {
		int c = 0;
		
		for (int s = 1; s <= a / 2; s++)
		{
			if (a % s == 0)
			{
				c += s;
			}
		}
		
		return c;
	}

}
