//Twitter Project 
//CPSC 330 Dr. Anewalt 2015
//Group: David Izaguirre, Tyler Truslow, Michelle Desormeaux
	
import java.util.*;
import java.io.*;

public class Client {
	public static void main (String args[]) {
		
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		
		
		System.out.println("              K###");
		System.out.println("              ####");
		System.out.println("             D####");
		System.out.println("         W## #####");
		System.out.println("       ###########");
		System.out.println("     i###   ######");
		System.out.println("    :##G   D######   W##W ###:###### ###  ### K######  ###### #######. ######E");
		System.out.println("    ##     ### ###   ###  ### ###### ###  ### ######L  ###### ######## ######");
		System.out.println("   ##     f### ###   ### ###W ###### ### ###.G######  t######.###,###tj######");
		System.out.println("  D#K     ###G ###   ### ### ###W   K### ### ###      ###    ###  ### ###i");
		System.out.println("  ##     i###  ###   ###L### ###    #### ### ###      ###    ###  ### ###");
		System.out.println("  ##     ###E  ###   ######  ###    ####j##E ###      ###    ### E### ###");
		System.out.println(" f#     .###   ###   ##D### t#####G.####### ###f.### ###### ###WG### ######");
		System.out.println(" ##     ####    ##  t#####. ###### ######## ### #### ###### ######## #######");
		System.out.println(" ##     ###    # #  ######  ###### ######## ### #### ###### #######  #######");
		System.out.println(" ##    ##########   #####.  ###    ####### K### ### ####   :### ###i    ###,");
		System.out.println(" K#   :###########  #####  ###D   W## #### ###  ### ###    ###  ###     ###");
		System.out.println("  #W  ############f ####E  ###    ### #### ###  ### ###    ###  ###     ###");
		System.out.println("  ##  ###########   ####   ###### ### ###G ### L##iG######,### #### ######W");
		System.out.println("  ## ####      # #  ####  L#####,,##L ### W####### ###### ###L ###  ######");
		System.out.println("   # ####       ## G###   ###### ###  ###  ####### ###### ###  ### i######");
		System.out.println("   .####                                       #j");
		System.out.println("    ####           ###                        f");
		System.out.println("   ####GE        ###W");
		System.out.println("   #### ####fL#####");
		System.out.println("  ####L ;########");
		System.out.print("  Press Enter:");
		
		kb.nextLine();
		
		System.out.println("\n\n(Welcome to the Avengers Initiative Communication System. Please be aware that all ).\n\n");
		
		
		do	{
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("L: Login.");
			System.out.println("R: Register.");
			System.out.println("P: View public tweets.");			
			
			//This is commented out so the networked client does not drop
				//people into the unix terminal. It still will of they ctrl+c though.
			//System.out.println("Q: Quit program.\n");
			
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
				printPublicTweets("");
					//print public tweets with an empty name will print for unregistered
					//if you send a username as a parameter then wit will print for a user
						//this is important because if you are printing for a user they will...
						//... see the private tweets of their followers
							//i'm considering making... just check the issues page on the github please
			}
		} while (!menuOption.equals("QUIT") && !menuOption.equals("quit"));
		
		//clean quit code
		//aka Main ends here
	}
//------------------------------------------------------------------------------------------------------ 	


	
	
//--MAIN MENU FUNCTION-------------------------------------------------------------------------------------------- 
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
				makeTweet(username);
			} else if (menuOption.equals("V") || menuOption.equals("v")) {
				//viewTweets(username);
			} else if (menuOption.equals("P") || menuOption.equals("p")) {
				printPublicTweets(username);
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



//----MAKE TWEET-----------------------------------------------------------------------------------------------

	public static void makeTweet(String username) {
		
	}

//------------------------------------------------------------------------------------------------------ 


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
				editBio(username);
			} else if (menuOption.equals("C") || menuOption.equals("c")) {
				changePassword(username);
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//go to main menu
	}
//--------------------------------------------------------------------------------------------------------------------- 

//---CHANGE PASSWORD-------------------------------------------------------------------------------------------
     public static void changePassword(String user){
          Scanner kb = new Scanner(System.in);
          ArrayList<User> users = readUserFile();
          System.out.println("Please enter your new desired password: ");
          String newPW = kb.nextLine();
          
          
          
     
     
} // end of changePassword()

//-----------------------------------------------------------------------------------------------------------


//---PRINT PUBLIC TWEETS-------------------------------------------------------------------------------------------
     public static void printPublicTweets(String user){
          // Load tweets
          ArrayList<Tweet> tweets = readTweetFile();
          ArrayList<User> users = readUserFile();
          
          if(user == ""){          
               for(int i = 0; i < tweets.size(); i++){
                    Tweet temp = tweets.get(i);
                    if(temp.pubTweet){
                        // String padded = temp.author + ("          ".substring(temp.author.length()));
                        // System.out.print(padded);
                         System.out.println(temp.author + ":");
                         System.out.println("    " + temp.body);
                         System.out.println();
                    }     
               }
          } // endif user is ""
          else{ // if username is entered
               
               for(int i = 0; i < tweets.size(); i++){
                    Tweet temp = tweets.get(i);
                    if(temp.pubTweet){
                         System.out.println(temp.author + ":");
                         System.out.println("    " + temp.body);
                         System.out.println();
                         
                    }
                    else{ // tweet is not public 
                         for(int k = 0; k < users.size(); k++){
                              User curr = users.get(k);
                              if(curr.username.equals(user)){
                                   ArrayList<String> following = curr.getFollowingList();
                                   for(int t = 0; t < following.size(); t++){
                                        String followingTemp = following.get(t);
                                        if(followingTemp.equals(temp.author)){
                                             // String padded = temp.author + ("          ".substring(temp.author.length()));
                                             // System.out.print(padded);
                                                System.out.println("Private tweet from " + temp.author + ":");
                                                System.out.println("    " + temp.body);
                                                System.out.println();
                                        }
                                   }
                              }     
                         }
                    }
          
                }
          }
      
     } // end of PrintPublicTweets()
//------------------------------------------------------------------------------------------------------ 

	
//---REGISTER A NEW USER------------------------------------------------------------------------------------- 
	public static void register() {
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		String prompt;
		
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
		System.out.println("Would you like to write a bio for your profile?\n[y/N]: ");
		prompt = kb.nextLine();
		if (prompt.equalsIgnoreCase("Y") || prompt.equalsIgnoreCase("YES")) {
			editBio(username);
		}
	}
//------------------------------------------------------------------------------------------------------ 
	
//---EDIT BIO--------------------------------------------------------------------------------------------------- 
	public static void editBio(String username) {
		Scanner kb = new Scanner(System.in);
		String bioLine = "";
		String bioLinef = "";
		
		System.out.println("Your current bio looks like this: ");
		
		ArrayList<User> users = readUserFile();
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equalsIgnoreCase(username)) {
				System.out.println("\""+users.get(i).getBio()+"\"");
			}
		}
		
		System.out.println("Please enter your desired bio. \nIf you want to keep your current bio then simply press enter:");
		
		bioLine = kb.nextLine();
		
		//we don't want an empty bio
		bioLinef = bioLine.replaceAll(" ","");
		
		if (!bioLinef.equals("")) {
			ArrayList<User> usersBurn = readUserFile();
			for (int i = 0; i < usersBurn.size(); i++) {
				if (usersBurn.get(i).getUsername().equalsIgnoreCase(username)) {
					usersBurn.get(i).setBio(bioLine);
				}
			}
			writeUserFile(usersBurn);
		}
	}
//------------------------------------------------------------------------------------------------------ 
	
//---AUTHENTICATE--------------------------------------------------------------------------------------------------- 
	public static void authenticate() {
		//We will need to read the usrename here
		//the username list must be filled here as opposed to while the program initializes...
			//..so people who register and then try to log in without quitting can log in
		
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		boolean found = false;
		
		System.out.println("Enter your username: ");
		username = kb.nextLine();
		
		System.out.println("Enter your password: ");
		password = kb.nextLine();
		
		ArrayList<User> users = readUserFile();
		
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equalsIgnoreCase(username)) {
				found = true;
				if (users.get(i).getPassword().equals(password)) {
					System.out.println("You are now logged in!\n");
					mainMenu(username);
				} else {
					System.out.println("Login failed. Password does not match.");
				}
			}
		}
		
		if (!found){
			System.out.println("Could not find username.");
		}
	}
//------------------------------------------------------------------------------------------------------ 

//--LOOKUP USER MENU-----------------------------------------------------------------------------------------------------
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
			
			//select correct method - menu option
			if (menuOption.equals("S") || menuOption.equals("s")) {
				//searchUser(username);
			} else if (menuOption.equals("F") || menuOption.equals("f")) {
				followUser(username);
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


//--FOLLOW A USER ---------------------------------------------------------------------------------------------------- 
	public static void followUser(String currentUser) {
		Scanner kb = new Scanner(System.in);
		//user types in person to follow
		String userToFollow = "";
			
		System.out.println("Please enter the username to follow: "); 
		userToFollow = kb.nextLine();
		System.out.println(); 
		
		//check to see if user exists
		boolean resultOfExist = doesUserExist(userToFollow);
		if (resultOfExist == true) {
				if (!userToFollow.equalsIgnoreCase(currentUser)) {
					if (!isAlreadyFollowing(currentUser, userToFollow)) {
						//find the actual User object of current user
						ArrayList<User> usersInFile = readUserFile();
						int lengthOfUsersInFile = usersInFile.size();

						//the user is guaranteed to be in here bc of result of user exist
						for (int i = 0; i < lengthOfUsersInFile; i++) {
							String aUserInTheFile = (usersInFile.get(i)).getUsername();
							//finding user object	
							if (aUserInTheFile.equalsIgnoreCase(currentUser)) {
								ArrayList<String> currentFollowing = usersInFile.get(i).getFollowingList();
								//add user to following list
								currentFollowing.add(userToFollow);
								//update files
								writeUserFile(usersInFile);
								System.out.println("The user: " + userToFollow + " has been added to your following list."); 
							}//end if
						}//end for
					} else {
						System.out.println("You are already following: " + userToFollow + "."); 	
						System.out.println("---------------------------"); 
					}
				} else {
					System.out.println("You can't follow yourself!"); 
					System.out.println("---------------------------"); 
				}
		} else {
			System.out.println("I'm sorry, that user doesn't exist. Please try again."); 
			System.out.println("---------------------------"); 
		}

	}//end follow user
//------------------------------------------------------------------------------------------------------ 
	
//--IS AREADY IN FOLLOWING LIST---------------------------------------------------------------------------------------------------- 
	public static boolean isAlreadyFollowing(String currentUser, String userToFollow) {
		//find the actual User object of current user
		ArrayList<User> usersInFile = readUserFile();
		ArrayList<String> currentFollowing = new ArrayList<String>();
		int lengthOfUsersInFile = usersInFile.size();

		//the user is guaranteed to be in here bc of result of user exist
		for (int i = 0; i < lengthOfUsersInFile; i++) {
			String aUserInTheFile = (usersInFile.get(i)).getUsername();
			//finding user object	
			if (aUserInTheFile.equalsIgnoreCase(currentUser)) {
				currentFollowing = usersInFile.get(i).getFollowingList();
			}//end if
		}//end for

		int currentFollowingLength = currentFollowing.size();
		for (int i = 0; i < currentFollowingLength; i++) {
			String aUserInFollowing = (currentFollowing.get(i));
			if (aUserInFollowing.equalsIgnoreCase(userToFollow)) {
				return true;	
			} 
		}
		return false;	
	}
//------------------------------------------------------------------------------------------------------ 


//---CHECK IF USER EXISTS-------------------------------------------------------------------------------------------------------
	//THIS FUNCTION ASSUMES NO DUPLICATE USERNAMES!
	public static boolean doesUserExist(String userToSearchFor) {
		ArrayList<User> usersToSearchList = readUserFile();
		int lengthOfSearchArray = usersToSearchList.size();

		for(int i = 0; i< lengthOfSearchArray; i++) {
			String currentUserName = (usersToSearchList.get(i)).getUsername();
			if (currentUserName.equalsIgnoreCase(userToSearchFor)) {
				//System.out.println("The user: " + currentUserName + " exists."); 
				//System.out.println(); 
				return true;	
			} 
			//if ( (i == lengthOfSearchArray - 1 ) & (!currentUserName.equals(userToSearchFor)) ) {
				//System.out.println("The user: " + userToSearchFor + " does not exist."); 	
				//System.out.println(); 
				//return false;
			//}
		}
		//This might be bogus
		return false;
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
