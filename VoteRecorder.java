import java.util.*;
public class VoteRecorder
{
	private static String nameCandidatePresident1,nameCandidatePresident2;
	private static String nameCandidateVicePresident1,nameCandidateVicePresident2;
	private static int votesCandidatePresident1, votesCandidatePresident2;
	private static int votesCandidateVicePresident1, votesCandidateVicePresident2;
	int myVoteForPresident, myVoteForVicePresident;
	public VoteRecorder()
	{
	}
	public static void setCandidatesPresident(String name1, String name2)
	{
		nameCandidatePresident1=name1;
		nameCandidatePresident2=name2;
	}
	public static void setCandidatesVicePresident(String name1, String name2)
	{
		nameCandidateVicePresident1=name1;
		nameCandidateVicePresident2=name2;
	}
	public static void resetVotes()
	{
		votesCandidatePresident1=0;
		votesCandidatePresident2=0;
		votesCandidateVicePresident1=0;
		votesCandidateVicePresident2=0;
	}
	public static String getCurrentVotePresident()
	{
		return "Total votes for " + nameCandidatePresident1 + ": " + votesCandidatePresident1 + "\n" + "Total votes for " + nameCandidatePresident2 + ": " + votesCandidatePresident2;
	}
	public static String getCurrentVoteVicePresident()
	{
		return "Total votes for " + nameCandidateVicePresident1 + ": " + votesCandidateVicePresident1 + "\n" + "Total votes for "  + nameCandidateVicePresident2 + ": " + votesCandidateVicePresident2;
	}
	public void getAndConfirmVotes()
	{
		Scanner input = new Scanner(System.in);
		getVotes();
		if (confirmVotes()==true)
		{
			System.out.println("Are there any other voters? Please enter 'Yes' or 'No'");
			String i = input.next();
			if(i.equalsIgnoreCase("Yes"))
			{
				getAndConfirmVotes();
			}
		}
		else
		{
			getAndConfirmVotes();
		}
		recordVotes();
	}
	private int getAVote(String name1, String name2)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your vote choice. Enter 0 for no choice. Enter 1 for " + name1 + ". Enter 2 for " + name2);
		int choice = input.nextInt();
		return choice;
	}
	private void getVotes()
	{
		myVoteForPresident=getAVote(nameCandidatePresident1, nameCandidatePresident2);
		myVoteForVicePresident=getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);;

	}
	private boolean confirmVotes()
	{
		Scanner input = new Scanner(System.in);
		if (myVoteForPresident==0)
		System.out.println("You did not cast a vote for President.");
		if (myVoteForPresident==1)
			System.out.println("You voted for " + nameCandidatePresident1 + " as President.");
		if (myVoteForPresident==2)
			System.out.println("You voted for " + nameCandidatePresident2 + " as President.");
		if (myVoteForVicePresident==0)
			System.out.println("You did not cast a vote for Vice President.");
		else if (myVoteForVicePresident==1)
			System.out.println("You voted for " + nameCandidateVicePresident1 + " as Vice President.");
		else if (myVoteForVicePresident==2)
			System.out.println("You voted for " + nameCandidateVicePresident2 + " as Vice President.");
		System.out.println("Are you satisfied with these results? Enter 'Yes' or 'No'");
		String choice = input.next();
		if (choice.equalsIgnoreCase("Yes"))
			return true;
		if (choice.equalsIgnoreCase("No"))
			return false;
		else
			return false;
		}

	private void recordVotes()
	{
		if (myVoteForPresident==1)
		votesCandidatePresident1++;
		else
		votesCandidatePresident1=votesCandidatePresident1;
		if (myVoteForPresident==2)
		votesCandidatePresident2++;
		else
		votesCandidatePresident2=votesCandidatePresident2;
		if (myVoteForVicePresident==1)
		votesCandidateVicePresident1++;
		else
		votesCandidateVicePresident1=votesCandidateVicePresident1;
		if (myVoteForVicePresident==2)
		votesCandidateVicePresident2++;
		else
		votesCandidateVicePresident2=votesCandidateVicePresident2;

	}
}