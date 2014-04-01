import java.util.*;
public class TestGrade
{
	public static void main(String[] args)
	{
	Grade classGrade = new Grade();
	for (int i=0; i < classGrade.grade.length; i++)
		{
			 Scanner input = new Scanner(System.in);
			 System.out.println("Please enter grade " + i);
			 classGrade.grade[i] = input.nextInt();
		 }
	System.out.println("The average grade is: " + classGrade.Average(0));
	System.out.println("The minimum grade is: " + classGrade.Min(0));
	System.out.println("The maximum grade is: " + classGrade.Max(0));

	}

}
