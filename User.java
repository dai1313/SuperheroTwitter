import java.util.*;
import java.text.*;

public class User {
	protected String username = "";
	protected String password = "";
	protected ArrayList<String> following = new ArrayList<String>();
	protected String bio;
	
	public User (String username, String password, ArrayList<String> following, String bio) {
		
	}

	
	public User (String fileline) {
		String[] split = fileline.split(" ");
		username = split[0];
		password = split[1];
		//String[] microSplit = split[2].split("`");
		//ArrayList
		bio = split[3];
	}
	
	public String toString() {
		String ret = (username + " " + password + " " + following + " " + bio);
		return ret;
	}
	
	//we need a constructor that takes a string here
	
	//we also need a toString()
	
	//the output of toString() should be able to be read by the string constructor
	
	//this way file I/O will be a lot smoother
	
	
	/**
	 * The user class will contain information about each different user. 
	 * The first data member for the user will be a name that is unique for each user. 
	 * The user class will also have a array list of strings containing the usernames 
	 *   of the people the user is following. 
	 * This information will be used to show the user the tweets of the people that 
	 *   the user is following. 
	 * The user class will also contain a Bio value that will display a bio for a 
	 *   user before a user decides to follow them.
	 */
}
