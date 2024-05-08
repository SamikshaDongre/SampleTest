package login;

public class Sample {

	public static void main(String[] args) {

		String name="Samiksha";
		int voteId=01, age=18;
		
		
		
		if(age<=18)
		{
			System.out.println("VoterID  ||||||||" + " Name");
			System.out.println(voteId +"        |||||||| " + name);
			System.out.println();
			System.out.println(" Welcome....." +name+ "!! You are eligible to vote");
		}
		  else
		    {
		       System.out.println("You are not eligible to vote.");
		    }

	}

}
