import java.util.*;
import java.text.*;

public class User {
	protected String username = "";
	protected String password = "";
	protected ArrayList<String> following = new ArrayList<String>();
	protected String bio;
	
	
	public User (String usernamep, String passwordp, String followingp, String biop) {
		username = usernamep;
		password = passwordp;
		
		//break up the following and fill array list
		for (String singleUserFollowing: followingp.split(",")) {
			following.add(singleUserFollowing);
		}
		bio = biop;
	}

	
	public User (String fileline) {
		String[] split = fileline.split(" ");
		username = split[0];
		password = split[1];
		
		//break up the following and fill array list
		for (String singleUserFollowing: split[2].split(",")) {
			following.add(singleUserFollowing);
		}
		bio = split[3];
		
		//fix the bio
		bio = bio.replaceAll("`"," ");
	}
	
	public String toString() {
		//remove the brackets from the array list toString()
		String followingf = following.toString();
		followingf = followingf.substring(1,followingf.length()-1);
		
		//strip out the spaces
		followingf = followingf.replaceAll("\\s","");
		
		//now format the bio
		bio = bio.replaceAll(" ","`");
		
		
		String ret = (username + " " + password + " " + followingf + " " + bio);
		return ret;
	}
	
	//we need a constructor that takes a string here
	
	//we also need a toString()
	
	//the output of toString() should be able to be read by the string constructor
	
	//this way file I/O will be a lot smoother

//---------getters and setters----------------------------------
        //getter for Username 
        public String getUsername() {
            return username;
        }
        //setter for Username 
        public void setUsername(String newUsername) {
            username = newUsername;
        }
       

        //getter for password 
        public String getPassword() {
            return password;
        }
        //setter for password 
        public void setPassword(String newPass) {
            password = newPass;
        }


        //getter for following 
        public ArrayList<String> getFollowingList() {
            return following;
        }
        //setter for following 
        public void setNewFollowingList(ArrayList<String> newFollowing) {
            following = newFollowing;
        }
        
        //getter for bio 
        public String getBio() {
            return bio;
        }
        //setter for bio 
        public void setBio(String newBio) {
            bio = newBio;
        }

//------------------------------------------------------------------------------
	
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



