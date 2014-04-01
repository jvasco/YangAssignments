import java.util.*;
public class Gradebook
{
	Scanner input= new Scanner(System.in);
	double[][] grade= new double[10][5];
	String[] name= new String[10];
	double[] avg= new double[10];
	public void nameEntry()
	{
		int i;
		System.out.println("Please enter the names of your (10) students");
		for(i=0; i<name.length; i++)
		{
			name[i]= input.next();
		}
	}
	public void gradeEntry()
	{
		for(int i=0; i<name.length; i++)
		{
			System.out.println("Please enter 5 grades for "+ name[i]);
			for(int d=0; d<grade[i].length; d++)
			{
				grade[i][d]= input.nextDouble();
			}
		}
	}
	public void calculateAvg()
	{
		for(int i=0; i<grade.length; i++)
		{
			double sum=0;
			for(int d=0; d<grade[0].length; d++)
			{
				sum+=grade[i][d];
			}
			avg[i]= (sum/5);
		}
	}
	public void sortGrades()
	{
		for(int i=0; i<grade.length; i++)
		{
			for(int d=0; d<grade[i].length; d++)
			{
				for(int e=0; e<(grade[i].length-1); e++)
				{
					if(grade[i][e]<grade[i][e+1])
					{
						double h=grade[i][e];
						grade[i][e]=grade[i][e+1];
						grade[i][e+1]=h;
					}
				}
			}
		}
	}
	public void sortAll()
	{
		for(int d=0; d<avg.length; d++)
		{
			for(int i=0; i<(avg.length-1); i++)
			{
				if(avg[i]<avg[i+1])
				{
					double h=avg[i];
					avg[i]=avg[i+1];
					avg[i+1]=h;
					String b=name[i];
					name[i]=name[i+1];
					name[i+1]=b;
					for(int a=0; a<grade[i].length; a++)
					{
						double r=grade[i][a];
						grade[i][a]=grade[i+1][a];
						grade[i+1][a]=r;
					}
				}
			}
		}
	}
}