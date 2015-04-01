public class Client {
	public static void main (String args[]) {
		do	{
			System.out.println("\nWelcome to the superhero twitter(rework this).\n\n");
			
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
		} while (!menuOption.equals("Q") && !menuOption.equals("q"));
		
		//clean quit code
	}
}
