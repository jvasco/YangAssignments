import java.util.*;
public class Tower
{
	Scanner input = new Scanner(System.in);
	public int [][] create()
	{
		System.out.println("Welcome to the Tower of Hanoi puzzle!");
		System.out.println("Please enter the amount of disks");
		int number=input.nextInt();
		if(number%2==1)
		{
			solveOdd();
		}
		if(number%2==0)
		{
			solveEven();
		}
		int[][] tower1=new int[1][number];
		int[][] tower2=new int[1][number];
		int[][] tower3=new int[1][number];
		return tower1;
	}
	public void solveOdd()
	{

	}
	public void solveEven()
	{
	}
}
