import java.util.*;
public class Pyramids
{
	public static void main(String[] args)
	{
		int rows;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows");
		rows=input.nextInt();
		for (int i=0; i<rows; i++)
		{
			for (int k=rows; k>i+1; k--)
			{
				System.out.print(" ");
			}
			for  (int j=0; j<i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}