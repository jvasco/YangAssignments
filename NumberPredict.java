import java.util.Scanner;
public class NumberPredict
{
public static void main(String[] args)
 {
int answerOne=0;
int answerTwo=0;
int answerThree=0;
int answerFour= 0;
int predictedNum1=0;
int predictedNum2=0;
int predictedNum3=0;
int predictedNumFinal=0;
Scanner keyboard = new Scanner(System.in);
	System.out.println("Choose a number between 1 and 15.");
	System.out.println("Is your number in the following list?");
	System.out.println("1,3,5,7,9,11,13,15");
	System.out.println("Yes=1, No=0");
	answerOne = keyboard.nextInt();
	if (answerOne == 1)
		predictedNum1 = 1;
	if (answerOne == 0)
		predictedNum1 = 0;
	System.out.println("Is your number in the next list?");
	System.out.println("2,3,6,7,10,11,14,15");
	System.out.println("Yes=1, No=0");
	answerTwo = keyboard.nextInt();
	if (answerTwo == 1)
		predictedNum2 = predictedNum1 + 2;
	if (answerTwo == 0)
		predictedNum2 = predictedNum1 + 0;
	System.out.println("Is your number in the third list?");
	System.out.println("4,5,6,7,12,13,14,15");
	System.out.println("Yes=1, No=0");
	answerThree = keyboard.nextInt();
	if (answerThree == 1)
		predictedNum3 = predictedNum2 + 4;
	if (answerThree == 0)
		predictedNum3 = predictedNum2 + 0;
	System.out.println("Is your number in the last list?");
	System.out.println("8,9,10,11,12,13,14,15");
	System.out.println("Yes=1, No=0");
	answerFour = keyboard.nextInt();
	if (answerFour == 1)
		predictedNumFinal = predictedNum3 + 8;
	if (answerFour == 0)
		predictedNumFinal = predictedNum3 + 0;
	System.out.println("Your magic number is " + predictedNumFinal +"!");
 }
	}