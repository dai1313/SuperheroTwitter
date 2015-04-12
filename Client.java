import java.util.*;
import java.io.*;

public class Client {
	public static void main (String args[]) {
		
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		System.out.println("Welcome to the superhero twitter(rework this).\n\n");
		do	{
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("L: Login.");
			System.out.println("R: Register.");
			System.out.println("P: View public tweets.");			
			System.out.println("Q: Quit program.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			
			System.out.println("----------------------------------------------------------"); 
		
			//select correct method - menu option
			if (menuOption.equals("L") || menuOption.equals("l")) {
				authenticate();
			} else if (menuOption.equals("R") || menuOption.equals("r")) {
				register();
			} else if (menuOption.equals("P") || menuOption.equals("p")) {
				//printPublicTweets("");
					//print public tweets with an empty name will print for unregistered
					//if you send a username as a parameter then wit will print for a user
						//this is important because if you are printing for a user they will...
						//... see the private tweets of their followers
							//i'm considering making... just check the issues page on the github please
			}
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//clean quit code
		//aka Main ends here
	}
//------------------------------------------------------------------------------------------------------ 	


//--MAIN MENU-------------------------------------------------------------------------------------------------- 
	public static void mainMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		
		do	{
			
			System.out.println("----------------------------------------------------------"); 
		
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("T: Make a tweet.");
			System.out.println("V: View tweets.");
			System.out.println("P: View public tweets.");			
			System.out.println("L: Lookup/Follow user.");
				//S: Search users
				//F: Follow user
			System.out.println("U: Edit user settings.");
				//B: Edit bio
				//C: Change password
//Search by hashtag is an A requirement thing, commented it out so I would feel better. :)
//Obviously, you can still get to this option by pushing s.
//			System.out.println("S: Search for a tweet by hashtag.");
			System.out.println("R: Respond to a tweet.");			
			System.out.println("Q: Log off.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			
			System.out.println("----------------------------------------------------------"); 
		
			//select correct method - menu option
			if (menuOption.equals("T") || menuOption.equals("t")) {
				//makeTweet(username);
			} else if (menuOption.equals("V") || menuOption.equals("v")) {
				//viewTweets(username);
			} else if (menuOption.equals("P") || menuOption.equals("p")) {
				//viewPublicTweets(username);
			} else if (menuOption.equals("L") || menuOption.equals("l")) {
				lookupUser(username);
			} else if (menuOption.equals("U") || menuOption.equals("u")) {
				userSettingsMenu(username);
			} else if (menuOption.equals("S") || menuOption.equals("s")) {
				//searchHashtag(username);
			} else if (menuOption.equals("R") || menuOption.equals("r")) {
				//respond(username);
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//return to top menu
	}
//------------------------------------------------------------------------------------------------------ 

//--LOOKUP USER-----------------------------------------------------------------------------------------------------
	public static void lookupUser(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		
		do	{
			System.out.println("User Lookup/Follow Menu.");
			
			//display the menu
			System.out.println("S: Search users.");
			System.out.println("F: Follow user.");	
			System.out.println("Q: Return to main menu.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			//select coorect method - menu option
			if (menuOption.equals("S") || menuOption.equals("s")) {
				//searchUser(username);
			} else if (menuOption.equals("F") || menuOption.equals("f")) {
				//followUser(username);
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//go to main menu
	}
//--------------------------------------------------------------------------------------------------------------------- 

//----USER SETTINGS MENU-----------------------------------------------------------------------------------------------
	public static void userSettingsMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		do	{
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("B: Edit Bio.");
			System.out.println("C: Change password.");	
			System.out.println("Q: Return to main menu.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			//select correct method - menu option
			if (menuOption.equals("B") || menuOption.equals("b")) {
				//editBio(username);
			} else if (menuOption.equals("C") || menuOption.equals("c")) {
				//changePassword(username);
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//go to main menu
	}
//--------------------------------------------------------------------------------------------------------------------- 

//--VALIDATE PASSWORD---------------------------------------------------------------------------------------------------- 	
	public static boolean validatePassword(String password) {
		//do we need this fuction to check for number of characters and all of that? Is that in the b requirements?
		return true;
	}
//------------------------------------------------------------------------------------------------------ 
	
//--REGISTER---------------------------------------------------------------------------------------------------- 
	public static void register() {
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Enter your desired username: ");
		username = kb.nextLine();
		
		System.out.println("Enter your desired password: ");
		password = kb.nextLine();
		
		if (!validatePassword(password)) {
			System.out.println("This password does not meet the minimum requirements. \n(Explain)");
			return;
		}
		
		ArrayList<User> users = readUserFile();
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equalsIgnoreCase(username)) {
				System.out.println("This name already exists in the system.\n");
				return;
			}
		}
		
		//add user here
		User a = new User(username, password, "NULL", "This user has not written a bio yet.");
		users.add(a);
		writeUserFile(users);
		
		
		//prompt for bio entry
		
		
	}
//------------------------------------------------------------------------------------------------------ 	
	
//--AUTHENTICATE---------------------------------------------------------------------------------------------------- 
	public static void authenticate() {
		//We will need to read the usrename here
		//the username list must be filled here as opposed to while the program initializes...
			//..so people who register and then try to log in without quitting can log in
		
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Enter your username: ");
		username = kb.nextLine();
		
		System.out.println("Enter your password: ");
		password = kb.nextLine();
		
		ArrayList<User> users = readUserFile();
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equalsIgnoreCase(username)) {
				if (users.get(i).getPassword().equals(password)) {
					System.out.println("You are now logged in!\n");
					mainMenu(username);
				} else {
					System.out.println("Login failed. Password does not match.");
					return;
				}
			}
		}
		
		System.out.println("Could not find username.");
		return;
	}
//------------------------------------------------------------------------------------------------------ 

//-----SEARCH FOR A USER-------------------------------------------------------------------------------------------------------
	//THIS FUNCTION ASSUMES NO DUPLICATE USERNAMES!
	//should this return a string representing the users name or an actual user?
	public static String searchUser(String usernameToSearch) {
		try {
			//get list of users from files
			ArrayList<User> usersToSearchList = readUserFile();

			
			//austin says it will be an array and you can parse through that


			//compare each username to the usernametosearch

			//


		} catch (Exception e) {
			System.out.println("Exception ocurred in searchUser().");
			System.out.println(e); 
		}
		return userFound;
	}
//------------------------------------------------------------------------------------------------------ 
	
//---READ FROM USER FILE---------------------------------------------------------------------------------------------------------
	public static ArrayList<User> readUserFile() {
		ArrayList<User> users = new ArrayList<User>();
		try {
			//We will need to fill the list from data in the users.dat
			File file = new File("users.dat");
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = "";
			//reads the file and fills the array list
			while ((line = reader.readLine()) != null) {
				User a = new User(line);
				users.add(a);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("IOException ocurred in readUserFile().");
		}
		return users;
	}
//--------------------------------------------------------------------------------------------------------------------- 
	
//----WRITE TO USER FILE--------------------------------------------------------------------------------------------------------
	public static void writeUserFile(ArrayList users) {
		try {
			//write the users to the disk
			File file = new File("users.dat");
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			for (int i = 0; i < users.size(); i++) {
				writer.write(users.get(i)+"\n");
			}	
			writer.close();
		} catch (IOException e) {
			System.out.println("IOException ocurred in writeUserFile().");
		}	
	}
//--------------------------------------------------------------------------------------------------------------------- 
	
//----READ FROM TWEET FILE--------------------------------------------------------------------------------------------------------
	public static ArrayList<Tweet> readTweetFile() {
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();		
		try {	
			//We will need to fill the list from data in the tweets.dat
			File file = new File("tweets.dat");
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = "";
			//reads the file and fills the array list
			while ((line = reader.readLine()) != null) {
				Tweet a = new Tweet(line);
				tweets.add(a);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("IOException ocurred in readTweetFile().");
		}	
			
		return tweets;
	}
//--------------------------------------------------------------------------------------------------------------------- 
	
//-----WRITE TO TWEET FILE--------------------------------------------------------------------------------------------------
	public static void writeTweetFile(ArrayList tweets) {
		try {
			//write the tweets to the disk
			File file = new File("tweets.dat");
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			for (int i = 0; i < tweets.size(); i++) {
				writer.write(tweets.get(i)+"\n");
			}	
			writer.close();
		} catch (IOException e) {
			System.out.println("IOException ocurred in writeTweetFile().");
		}	
	}
//--------------------------------------------------------------------------------------------------------------------- 






//--------------------------------------------------------------------------------------------------------------------- 
//-Client.java ends here---------------------------------------------------------------------------------------

}
