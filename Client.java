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
				//authenticate();
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
		//crosscheking the username and pasword happens here 
		
		
	}
	
	
	/**
	T: Make a tweet
	V: View tweets
	P: View Public + Following
	L: Lookup User
		F: Follow user
	U: Edit user settings:
		B: Edit bio
		//perhaps put a menu for managing following here
	S: Search for a tweet by hashtag
	R: Respond to a tweet
	Q: Log off
	*/
	
}
