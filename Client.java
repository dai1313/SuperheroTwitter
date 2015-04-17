//Twitter Project 
//CPSC 330 Dr. Anewalt 2015
//Group: David Izaguirre, Tyler Truslow, Michelle Desormeaux
	
import java.util.*;
import java.io.*;
import java.lang.System;

public class Client {
	public static void main (String args[]) {
	
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
	
		System.out.println("    Welcome, to The..."); 
		System.out.println("  "); 
		
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
	
		System.out.println(); 
		System.out.println("\n  ...Initiative Communication System.\n");
		System.out.println(); 
		System.out.println(); 
		System.out.print("  Press Enter:");
		
		kb.nextLine();
		
		
		System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--"); 
		System.out.println("  This system was created in collaboration with the Avengers to help facilitate communications between heroes and civilians.");
		System.out.println("  Using Asgardian technology, we are able to bring together multiple universes and worlds in the name of social facilitation.");
		System.out.println("  We chose to keep the format simple so as to not confuse any members who might not have been exposed to today's technology."); 
		System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--"); 
		System.out.println(""); 
		System.out.println(""); 

		do	{
			System.out.println("--Main Menu------------------------------------------------------"); 
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("L: Login.");
			System.out.println("R: Register.");
			System.out.println("P: View public messages.");			
			
			//This is commented out so the networked client does not drop
				//people into the unix terminal. It still will of they ctrl+c though.
			//System.out.println("Q: Quit program.\n");
			
			System.out.println("\nEnter your choice: ");
			menuOption = kb.nextLine();
			System.out.println("----------------------------------------------------------"); 
		
			//select correct method - menu option
			if (menuOption.equals("L") || menuOption.equals("l")) {
				authenticate();
			} else if (menuOption.equals("R") || menuOption.equals("r")) {
				register();
			} else if (menuOption.equals("P") || menuOption.equals("p")) {
				printPublicTweets("");
					//print public messages with an empty name will print for unregistered
					//if you send a username as a parameter then wit will print for a user
						//this is important because if you are printing for a user they will...
						//... see the private messages of their followers
							//i'm considering making... just check the issues page on the github please
			}
		} while (!menuOption.equals("QUIT") && !menuOption.equals("quit"));
		System.out.println("Have a super day! ;) "); 
		System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--"); 
		
		//clean quit code
		//aka Main ends here
	}
//------------------------------------------------------------------------------------------------------ 	


//--MAIN MENU FUNCTION-------------------------------------------------------------------------------------------- 
	public static void mainMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		
		do	{
			System.out.println("--User Menu------------------------------------------------------"); 
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("C: Create a new message.");
			System.out.println("P: View public messages.");			
			System.out.println("V: View messages of people you're following.");
			System.out.println("L: Lookup/Follow user.");
				//S: Search users
				//F: Follow user
			System.out.println("U: Edit user settings.");
				//B: Edit bio
				//C: Change password
			System.out.println("S: Search for a message by hashtag.");
			System.out.println("R: Message another user.");			
            System.out.println("M: View your profile page.");			
			System.out.println("Q: Log off.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			System.out.println("----------------------------------------------------------"); 
		
			//select correct method - menu option
			if (menuOption.equals("C") || menuOption.equals("c")) {
				makeTweet(username);
			} else if (menuOption.equals("V") || menuOption.equals("v")) {
				viewTweets(username);
			} else if (menuOption.equals("P") || menuOption.equals("p")) {
				printPublicTweets(username);
			} else if (menuOption.equals("L") || menuOption.equals("l")) {
				lookupUser(username);
			} else if (menuOption.equals("U") || menuOption.equals("u")) {
				userSettingsMenu(username);
			} else if (menuOption.equals("S") || menuOption.equals("s")) {
				searchHashtag();
			} else if (menuOption.equals("R") || menuOption.equals("r")) {
                    System.out.println("Which user would you like to send a message to? (Please enter username, and press enter)");
                    String tweetTo = kb.nextLine();
                    if(isUser(tweetTo)){
				     tweetAt(username, tweetTo);
                    }
                    else{
                         System.out.println("Not a valid username.");
                    }
			} else if (menuOption.equals("M") || menuOption.equals("m")) {
                    viewProfile(username);
               }	
               
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//return to top menu
	}
//--END MAIN MENU FUNCTION-------------------------------------------------------------------------------------------- 

//--LOOKUP USER MENU-----------------------------------------------------------------------------------------------------
	public static void lookupUser(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		
		do	{
			System.out.println("--Follow Other Users----------------------------------------------------"); 
			System.out.println("Please enter your selection.");
			
			//display the menu
			//System.out.println("S: Search users.");	
			System.out.println("F: Follow user.");	
			System.out.println("A: Display all other users.");
			System.out.println("D: Display other user's Profiles.");
			System.out.println("Q: Return to the Main Menu.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			System.out.println("----------------------------------------------------------"); 
			//select correct method - menu option
			if (menuOption.equals("S") || menuOption.equals("s")) {
				//searchUser(username);
			} else if (menuOption.equals("F") || menuOption.equals("f")) {
				followUser(username);
			} else if (menuOption.equals("A") || menuOption.equals("a")) {
				displayAllUsers();
			} else if (menuOption.equals("D") || menuOption.equals("d")) {
				displayOthersProfile();
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		//go to main menu
	}
//--END LOOKUP USER MENU-----------------------------------------------------------------------------------------------------

//----USER SETTINGS MENU-----------------------------------------------------------------------------------------------
	public static void userSettingsMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		do	{
			System.out.println("--User Settings--------------------------------------------------------"); 
			System.out.println("Please enter your selection.");
			
			//display the menu
			System.out.println("B: Edit Bio.");
			System.out.println("C: Change password.");	
			System.out.println("Q: Return to the Main Menu.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			System.out.println("----------------------------------------------------------"); 
			//select correct method - menu option
			if (menuOption.equals("B") || menuOption.equals("b")) {
				editBio(username);
			} else if (menuOption.equals("C") || menuOption.equals("c")) {
				changePassword(username);
			}	
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//go to main menu
	}
//--END USER SETTINGS MENU-----------------------------------------------------------------------------------------------
//ooooooooooooooooo-^^^^-MENUS ABOVE-^^^^-ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo


//----MAKE TWEET-----------------------------------------------------------------------------------------------
	public static ArrayList<String> makeTweet(String username) {
		
		Scanner kb = new Scanner(System.in);
		//prompt for message body
		String prompt = selectRandomPrompt();
		
		prompt = prompt.concat("      (Push enter when done)");
		System.out.println(prompt); 
		//get body input
		String body = kb.nextLine();	
		int bodyLength = body.length();
		//System.out.println("You wrote: ");
		//System.out.println(body); 
		
		//limit of num chars - 140
		while (bodyLength > 140) {
			System.out.println("I'm sorry, but the message you have typed is too long. :( "); 
			System.out.println("Please enter a new shorter message."); 
			body = kb.nextLine();
		}

		//set is public or private. all are public by default?
		boolean isPub = true;
		System.out.println("Will this be a private message? [y/N]"); 
		String pubPrivateAns = kb.nextLine();
		if (pubPrivateAns.equalsIgnoreCase("Y") || pubPrivateAns.equalsIgnoreCase("YES")) {
			isPub = false;
		}

		//set hashtags
		ArrayList<String> listOfTags = new ArrayList<String>();

		//parse body for #s.
		if (body.contains("#")) {
			int count = 0;
			while (count < bodyLength) {
				if (body.charAt(count) ==  '#' ) {	
				//if it is, get the space delimited word after that
					int startOfHashtag = count;
					int countBetweenHashtags = 0;
					int endOfHashtag = count;
					int charCounter = count;
					while ((charCounter < bodyLength - 1) & (body.charAt(charCounter) != ' ')) {
						countBetweenHashtags++;
						//System.out.println("charCounter is: " + charCounter); 
						charCounter++;
					}//this is not a space. keep going
				//holy crap I found a space
				endOfHashtag = endOfHashtag + countBetweenHashtags + 1;
				//if you want to keep the hashtags with the hashtag sign, then delete this plus one. 
				//if you want to strip off the hashtag symbol, add 1 to startOfHashtag when you pass it in
				String theActualHashtag = body.substring(startOfHashtag + 1, endOfHashtag);
				//save it as a hashtag in the array list
				listOfTags.add(theActualHashtag);	
				} //end if. this is not a hashtag. keep going.
				count++;
			}
		} else {
			//there are no hashtags. wasn't really sure what to do
			listOfTags.add("NULL");
		}
		//make a new message.
		Tweet newTweet = new Tweet(username, body, isPub, listOfTags);
		//read the message file 
		ArrayList<Tweet> currentMessages = readTweetFile();	
		//add message to array list that the read message thing returns,
		currentMessages.add(newTweet);
		//write message file
		writeTweetFile(currentMessages);	
	
		System.out.println("  "); 
		return listOfTags;	
	}
//--END MAKE A TWEET---------------------------------------------------------------------------------------------------- 

//--SEARCH BY HASHTAG---------------------------------------------------------------------------------------------------
	public static void searchHashtag() {
		String hashtagToSearch = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hashtag you would like to find matching messages for. (Don't actually type the #)."); 	
		hashtagToSearch = kb.nextLine();
		System.out.println(); 
	
		//look through tweet file
		ArrayList<Tweet> allTheTweets = readTweetFile();	
		int tweetListSize = allTheTweets.size();

		System.out.println("The messages that contain the hashtag, " + hashtagToSearch + " are: "); 
		//then go through that and grab all of the hashtags
		for (int i = 0; i < tweetListSize; i++) {
			ArrayList<String> hashtagList = allTheTweets.get(i).getTags();	
				for (int z = 0; z < hashtagList.size(); z++) {
					if (hashtagList.get(z).equalsIgnoreCase(hashtagToSearch) && (allTheTweets.get(i).getPubTweet())) {
                              Tweet tempTweet = allTheTweets.get(i);
                              System.out.println(tempTweet.author + ":");
                              System.out.println("    " + tempTweet.body);
                              System.out.println();
					} //else {
						//if (i == tweetListSize - 1) { 
							//System.out.println("...Non-existant! Try another hashtag."); 
							//System.out.println("  "); 
						//}
					//}
				}
		}
	}
//--END SEARCH BY HASHTAG-------------------------------------------------------------------------------------------------------- 

//---VIEW PROFILE-------------------------------------------------------------------------------------------
     public static void viewProfile(String user) {
          ArrayList<User> users = readUserFile();
          ArrayList<Tweet> tweets = readTweetFile();
          
		  for (int i = 0; i < users.size(); i++) {
               User temp = users.get(i);
               if(temp.username.equalsIgnoreCase(user)){
                    System.out.println("Username: " + temp.username);
                    System.out.println("Bio: " + temp.bio);
                    System.out.println();
                    System.out.println("Followed Users: " + temp.getFollowingList()); 
                    System.out.println();
					System.out.println("Public Messages:");
                    
                    for(int k = 0; k < tweets.size(); k++){
                         Tweet tempTweet = tweets.get(k);
                         if (tempTweet.author.equalsIgnoreCase(user) && tempTweet.pubTweet){
                              System.out.println(temp.username + ":");
                              System.out.println("    " + tempTweet.body);
                              System.out.println();
                          }
                    } 
                 } 
            } 
          System.out.println();
	      System.out.println("---------------------------------------------------------------"); 
     } // end of viewProfile()
//--------------------------------------------------------------------------------------------------------------------- 

//------DISPLAY OTHERS PROFILE-------------------------------------------------------------------------- 
	public static void displayOthersProfile() {
		Scanner kb = new Scanner(System.in);
		String userToSearchFor = "";
		String userFound = "";
			
		System.out.println("Please enter the username who's profile you would like to display: "); 
		userToSearchFor = kb.nextLine();
		System.out.println(); 
		
		if (doesUserExist(userToSearchFor)) {
			viewProfile(userToSearchFor);
		} else {
			System.out.println("I'm sorry, that user doesn't exist. Please try again."); 
			System.out.println("-----------------------------------------------------------"); 
		}
		System.out.println("  "); 
	}
//------------------------------------------------------------------------------------------------------ 


//---VIEW TWEETS-------------------------------------------------------------------------------------------
     public static void viewTweets(String user){
          ArrayList<Tweet> tweets = readTweetFile();
          ArrayList<User> users = readUserFile();
          
		  for (int i = 0; i < tweets.size(); i++) {
               Tweet temp = tweets.get(i);
               for (int k = 0; k < users.size(); k++) {
                    User curr = users.get(k);

                    if (curr.username.equalsIgnoreCase(user)) {
                         ArrayList<String> following = curr.getFollowingList();
                         for(int t = 0; t < following.size(); t++){
                              String followingTemp = following.get(t);
                              if(followingTemp.equalsIgnoreCase(temp.author)){
                                   // String padded = temp.author + ("          ".substring(temp.author.length()));
                                   // System.out.print(padded);
                                   System.out.println(temp.author + ":");
                                   System.out.println("    " + temp.body);
                                   System.out.println();
                              }
                         }
                    }     
               }
           }
          
     }// end of viewTweets()
//--------------------------------------------------------------------------------------------------------------------- 

//---TWEET AT-------------------------------------------------------------------------------------------
     public static void tweetAt(String user, String tweetAt){
          Scanner kb = new Scanner(System.in);
          System.out.println("What would you like to say to @" + tweetAt + "? ");
          String tweetBody = kb.nextLine();
          System.out.println("Would you like this to be a private message? [y/N]");
          String privateT = kb.nextLine();
          boolean makePublic = true;
          
          if(privateT.equals("Y") || privateT.equals("y")){
               makePublic = false;
          }
          else{
               makePublic = true;
          }
          ArrayList<String> empty = new ArrayList<String>();
          String combo = "@" + tweetAt + " : " + tweetBody;
		//set hashtags
		ArrayList<String> listOfTags = new ArrayList<String>();
		int bodyLength = tweetBody.length(); 

		//parse body for #s.
		if (tweetBody.contains("#")) {
			int count = 0;
			while (count < bodyLength) {
				if (tweetBody.charAt(count) ==  '#' ) {	
				//if it is, get the space delimited word after that
					int startOfHashtag = count;
					int countBetweenHashtags = 0;
					int endOfHashtag = count;
					int charCounter = count;
					while ((charCounter < bodyLength - 1) & (tweetBody.charAt(charCounter) != ' ')) {
						countBetweenHashtags++;
						//System.out.println("charCounter is: " + charCounter); 
						charCounter++;
					}//this is not a space. keep going
				//holy crap I found a space
				endOfHashtag = endOfHashtag + countBetweenHashtags + 1;
				//if you want to keep the hashtags with the hashtag sign, then delete this plus one. 
				//if you want to strip off the hashtag symbol, add 1 to startOfHashtag when you pass it in
				String theActualHashtag = tweetBody.substring(startOfHashtag + 1, endOfHashtag);
				//save it as a hashtag in the array list
				listOfTags.add(theActualHashtag);	
				} //end if. this is not a hashtag. keep going.
				count++;
			}
		} else {
			listOfTags.add("NULL");
		}
		  
		  ArrayList<Tweet> tweets = readTweetFile();
            Tweet tweet = new Tweet(user, combo, makePublic, listOfTags);
            tweets.add(tweet);
            writeTweetFile(tweets);
          
          //System.out.println("Message sent: @" + tweetAt + " : " + tweetBody);
     } // end of tweetAt(user)
//---------------------------------------------------------------------------------------------------------------

//---IS USER-------------------------------------------------------------------------------------------
     public static boolean isUser(String user){
          ArrayList<User> users = readUserFile();
          boolean isUser = false;
          for(int i = 0; i < users.size(); i++){
               User temp = users.get(i);
               if(temp.username.equalsIgnoreCase(user)){
                    isUser = true;
               }
          }
          return isUser;
     }// end of isUser()
//----------------------------------------------------------------------------------------------------------

//---CHANGE PASSWORD-------------------------------------------------------------------------------------------
     public static void changePassword(String user){
          Scanner kb = new Scanner(System.in);
          ArrayList<User> users = readUserFile();
          System.out.println("Please enter your new desired password: ");
          String newPW = kb.nextLine();
          for(int i = 0; i < users.size(); i++){
               if(users.get(i).username.equalsIgnoreCase(user)){
                    users.get(i).password = newPW;    
               }     
          }
          System.out.println("New password will be " + newPW + ". Is this okay? [y/n]");
          String decision = kb.nextLine();
          if(decision.equals("Y") || decision.equals("y")){
               writeUserFile(users);
               System.out.println("Your password has been changed.");
          }
          else if(decision.equals("N") || decision.equals("n")){
               System.out.println("The password change has been cancelled.");
          }
          System.out.println();
	} // end of changePassword()
//-----------------------------------------------------------------------------------------------------------

//---PRINT PUBLIC TWEETS-------------------------------------------------------------------------------------------
     public static void printPublicTweets(String user){
          // Load messages
          ArrayList<Tweet> tweets = readTweetFile();
          ArrayList<User> users = readUserFile();
          
          if (user == "") {          
               for (int i = 0; i < tweets.size(); i++) {
                    Tweet temp = tweets.get(i);
                    if (temp.pubTweet) {
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
                              if(curr.username.equalsIgnoreCase(user)){
                                   ArrayList<String> following = curr.getFollowingList();
                                   for(int t = 0; t < following.size(); t++){
                                        String followingTemp = following.get(t);
                                        if(followingTemp.equalsIgnoreCase(temp.author)){
                                             // String padded = temp.author + ("          ".substring(temp.author.length()));
                                             // System.out.print(padded);
                                                System.out.println("Private tweet from: " + temp.author + ":");
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
//--END PRINT PUB TWEET------------------------------------------------------------------------------------------------- 

	
//---REGISTER A NEW USER------------------------------------------------------------------------------------- 
	public static void register() {
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		String prompt;
		
		System.out.println("Enter your desired username: ");
		username = kb.nextLine();
		
		Console consoleObject = null;	
		consoleObject = System.console();
		try {
			char[] hiddenPassword = consoleObject.readPassword("Enter your desired password:\n");
			String hiddenPassToString = new String(hiddenPassword);
			password = hiddenPassToString;
			//System.out.println(hiddenPassword); 
		} catch (Exception ugh) {
			//System.out.println("I tried, but ran into " + ugh); 
			System.out.println("Enter your desired password: ");
			password = kb.nextLine();
		}
		
		if (!validatePassword(password)) {
			System.out.println("This password does not meet the minimum requirements. \n");
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
		
		System.out.println("Please enter your new bio.  (If you want to keep your current bio then simply press enter):");
		bioLine = kb.nextLine();
	
		if (bioLine != "") {
			System.out.println("Your bio has been successfully updated!"); 
		}
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
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		boolean found = false;
	
		System.out.println("Enter your username: ");
		username = kb.nextLine();
		
		//hiding password stuff
		Console consoleObject = null;	
		consoleObject = System.console();
		try {
			char[] hiddenPassword = consoleObject.readPassword("Enter your password:\n");
			String hiddenPassToString = new String(hiddenPassword);
			password = hiddenPassToString;
			//System.out.println(hiddenPassword); 
		} catch (Exception ugh) {
			//System.out.println("I tried, but ran into " + ugh); 
			System.out.println("Enter your password: ");
			password = kb.nextLine();
		}

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
			System.out.println("Login failed. Could not find username.");
		}
	}
//---END AUTHENTICATE--------------------------------------------------------------------------------------------------- 

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
						System.out.println("--------------------------------------------------------------------"); 
					}
				} else {
					System.out.println("You can't follow yourself!"); 
					System.out.println("--------------------------------------------------------------------"); 
				}
		} else {
			System.out.println("I'm sorry, that user doesn't exist. Please try again."); 
			System.out.println("--------------------------------------------------------------------"); 
		}

	}//end follow user
//--END FOLLOW A USER ---------------------------------------------------------------------------------------------------- 

//ooooooooooooo--HELPER FUNCTIONS BELOW--ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo


//--VALIDATE PASSWORD---------------------------------------------------------------------------------------------------- 	
	public static boolean validatePassword(String password) {
		//do we need this fuction to check for number of characters and all of that? Is that in the b requirements?
		return true;
	}
//--END VALIDATE PASSWORD---------------------------------------------------------------------------------------------------- 	

//---SELECT RANDOM PROMPT-------------------------------------------------------------------------------------------- 		
//this function returns a "random" prompt each time it is called. This is Michelle's CodeBaby.
public static String selectRandomPrompt() {
	//select a random message prompt
		Random random = new Random();
		int maxNum = 6;
		int randomNum = random.nextInt(maxNum) + 1;
		//System.out.println("random number is: " + randomNum); 

		String randomPrompt = "Type your message here: ";

			if (randomNum == 1) { 	 	randomPrompt = "What's on your mind?";
		} else if (randomNum == 2) { 	randomPrompt = "Say something!";
		} else if (randomNum == 3) {	randomPrompt = "What's up?";
		} else if (randomNum == 4) { 	randomPrompt = "Anything new to report?";
		} else if (randomNum == 5) { 	randomPrompt = "What's happening?";
		} else if (randomNum == 6) {	randomPrompt = "How are you doing today?";
		} else { 						randomPrompt = "Tell me a secret~"; 
		}
		
	return randomPrompt;
}
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
//--END IS AREADY IN FOLLOWING LIST---------------------------------------------------------------------------------------------------- 

//---CHECK IF USER EXISTS-------------------------------------------------------------------------------------------------------
	//THIS FUNCTION ASSUMES NO DUPLICATE USERNAMES!
	public static boolean doesUserExist(String userToSearchFor) {
		ArrayList<User> usersToSearchList = readUserFile();
		int lengthOfSearchArray = usersToSearchList.size();

		for(int i = 0; i< lengthOfSearchArray; i++) {
			String currentUserName = (usersToSearchList.get(i)).getUsername();
			if (currentUserName.equalsIgnoreCase(userToSearchFor)) {
				return true;	
			} 
		}
		//This might be bogus
		return false;
	}
//--END CHECK IF USER EXISTS-------------------------------------------------------------------------------------------------------

//--DISPLAY ALL USERS------------------------------------------------------------------------------------------------------------- 
	public static void displayAllUsers() {
		
		ArrayList<User> allUsers = readUserFile();
		int lengthOfUsersInFile = allUsers.size();
		System.out.println("Here are all of the current users registered in the system: ");
		for (int i = 0; i < lengthOfUsersInFile; i++) {
			String currentUserName = (allUsers.get(i)).getUsername();
			System.out.print(currentUserName);
			if (i != lengthOfUsersInFile -1) {
				System.out.print(",  "); 
			}
		}//end for
		System.out.println(); 
		System.out.println(); 
		System.out.println("-------------------------------------------------------"); 
	}
//--END DISPLAY ALL USERS------------------------------------------------------------------------------------------------------------- 

//----FANCY SEARCH FUNCTION-------------------------------------------------------------------------------------------------- 
	//austin I don't know what you want to do here but heres a spot
	//take keyword user types in and look through bios find matching words in bio
	//return a list of users
//------------------------------------------------------------------------------------------------------ 

//ooooooooooooo-^^^^-HELPER FUNCTIONS ABOVE-^^^^-ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo


//ooooooooooooooooooooooo--READING AND WRITING FILES--oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo 
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
//--END READ FROM USER FILE------------------------------------------------------------------------------------------------------- 
	
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
