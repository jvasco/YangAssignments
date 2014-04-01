import java.util.*;
public class testVoteRecorder
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		VoteRecorder copy = new VoteRecorder();
		copy.setCandidatesPresident("Annie", "Bob");
		copy.setCandidatesVicePresident("John", "Susan");
		copy.getAndConfirmVotes();
		System.out.println("Would you like to reset the votes? If so, please enter 'Yes'");
		String i = input.next();
		if (i.equalsIgnoreCase("Yes"))
		{
			copy.resetVotes();
		}
		System.out.println(copy.getCurrentVotePresident());
		System.out.println(copy.getCurrentVoteVicePresident());

	}
}