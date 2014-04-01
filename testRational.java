import java.util.*;

class testRational
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner input= new Scanner(System.in);
		System.out.println("Please input a numerator.");
		while(true)
		{
			a = input.nextInt();
			if(a>0)
			{
				break;
			}
			else
			System.out.println("Invalid number. Please enter a positive, non-zero integer.");
		}
		System.out.println("Please enter a denominator.");
		while(true)
		{
			b = input.nextInt();
			if(b>0)
			{
				break;
			}
			else
			System.out.println("Invalid number. Please enter a positive, non-zero integer.");
		}

	RationalNumSimplifier stuff = new RationalNumSimplifier(a, b);
	stuff.simplify();
	int userGCD = stuff.getGCD();
	double userValue = stuff.getValue();
	String fraction = stuff.toString();
	System.out.println("The GCD of your ratio is " + userGCD);
	System.out.println("Your ratio in decimal form is " + userValue);
	System.out.println("Your ratio as a fraction is " + fraction);
	}
}