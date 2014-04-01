import java.util.*;
public class Testbook
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Gradebook usage= new Gradebook();
		usage.nameEntry();
		usage.gradeEntry();
		usage.calculateAvg();
		usage.sortGrades();
		usage.sortAll();
		for(int i=0; i<usage.grade.length; i++)
		{
			System.out.print(usage.name[i] + " ");
			for(int d=0; d<usage.grade[i].length; d++)
			{
				System.out.print(usage.grade[i][d] + " ");
			}
			System.out.print("Average " + usage.avg[i] + "\n");
		}
		for(int i=0; i<usage.grade.length; i++)
		{
			System.out.println(usage.name[i] + " " + usage.grade[i][0] + " " + usage.grade[i][4]);
		}
		System.out.println("The highest average belongs to " + usage.name[0] + " with an average of " + usage.avg[0]);
		System.out.println("The lowest average belongs to " + usage.name[9] + " with an average of " + usage.avg[9]);
	}
}