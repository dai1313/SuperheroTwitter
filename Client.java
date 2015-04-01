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
			System.out.println("E: Exit.\n");
			
			//grab the input from the user
			System.out.println("Enter your choice: ");
			menuOption = kb.nextLine();
			
			//select coorect method - menu option
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
		} while (!menuOption.equals("E") && !menuOption.equals("e"));
		
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
			
		System.out.println("Enter your password: ");
		password = kb.nextLine();
		
		//check to see if password is a match
			//If it does not match...
			//System.out.println("The password you entered does not match this username.");
			
			//If it does match...
			
		mainMenu(username);
	}
	
	
	
	
	
}
