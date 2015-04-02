import java.util.*;
import java.io.*;
 
public class Client {
	public static void main (String args[]) {
		
		//TESTTING TESTTING TESTING TESTING TESTING TESTING TESTING TESTING TESTING
		Tweet a = new Tweet("Frozone Where`is`my`super`suit!? true NULL");
		
		System.out.println(a.toString());
		
		
		
		//TESTING ENDS TESTING ENDS TESTING ENDS TESTING ENDS TESTING ENDS 
		
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
				//register();
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
	}
	
	
	
	public static void authenticate() {
		//We will need to read the usrename here
		//the username list must be filled here as opposed to while the program initializes...
			//..so people who register and then try to log in without quitting can log in
			
		//fillUserNameList(ArrayList usernames);
			//reading and writing to username files and tweet files is something we will...
			//be doing a lot of so we will need dedicated methods for this.
		
		//crosscheking the username and pasword happens here 
		Scanner kb = new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Enter your username: ");
		username = kb.nextLine();
		
		//check to see if username exists
			//If it dosen't exit...
			//System.out.println("We could not find this username in the records.");
				//im not sure if we want to go back to the login menu or ask...
				//...for a new user name here
			
		System.out.println("Enter your password: ");
		password = kb.nextLine();
		
		//check to see if password is a match
			//If it does not match...
			//System.out.println("The password you entered does not match this username.");
				//im not sure if we want to go back to the login menu or ask...
				//...for a new user name here
			
			//If it does match...
		mainMenu(username);
	}
	
	public static void mainMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		System.out.println("You are now logged in!\n");
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
			System.out.println("S: Search for a tweet by hashtag.");
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
	
	public static void userSettingsMenu(String username) {
		Scanner kb = new Scanner(System.in);
		String menuOption = "";
		System.out.println("You are now logged in!\n");
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
	
	
	
	
	
}
