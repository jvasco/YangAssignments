public class Grade
{
	int[] grade=new int[10];
	public Grade()
	{
	}

	int maxGradeIndex=0;
	int minGradeIndex=0;
	int maxGrade=grade[maxGradeIndex];
	int j=0;
	int k=0;
	int sum=0;

	public double Average(double a)
	{
		for (int i=0; i < grade.length; i++)
			{
				sum = sum + grade[i];
			}
	double avg=sum/grade.length;
	return avg;
	}

	public double Max(double m)
	{
		while (j < grade.length);
		{
		if(grade[maxGradeIndex]<grade[j]);
			{
				maxGradeIndex=j;
			}
		j++;
		}
	return maxGrade;
	}

	public double Min(double n)
	{
		while (k < grade.length);
		{
			if (grade[minGradeIndex]<grade[k]);
			{
				minGradeIndex=k;
			}
			k++;

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

	return minGradeIndex;
	}
}