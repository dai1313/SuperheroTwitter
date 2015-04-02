import java.util.*;
import java.text.*;

public class Tweet {
	
	protected String author = "";
	protected String body = "";
	protected boolean pubTweet = true;
	protected ArrayList<String> tags = new ArrayList<String>();
	
	//private String[] tags = {""};
	
	public Tweet (String authorp, String bodyp, boolean pubTweetp, ArrayList<String> tags) {
		author = authorp;
		body = bodyp;
		pubTweet = pubTweetp;
		
		//String[] microSplit = split[2].split("`");
		//tags = split[3]; //this should be a loop actually
	}
	
	
	public Tweet (String fileline) {
		String[] split = fileline.split(" ");
		author = split[0];
		body = split[1];
		pubTweet = Boolean.parseBoolean(split[2]);
		
		for (String singleTag: split[3].split("`")) {
			tags.add(singleTag);
		}

		//String[] microSplit = split[2].split("`");
		//tags = split[3]; //this should be a loop actually
	}
	
	
	public String toString() {
		String ret = author + " " + body + " " + pubTweet + " " + tags;
		return ret;
	}
	//we need a constructor that takes a string here
	
	//we also need a toString()
	
	//the output of toString() should be able to be read by the string constructor
	
	//this way file I/O will be a lot smoother
	
	
	
	/**
	 * The tweet class will make “Tweet” objects. 
	 * The tweet class will consist of three different data values. 
	 * Each tweet object will contain a message body that is 180 characters in length. 
	 * This message will be stored as a string. 
	 * The message string will be parsed by the 
	 *   program for any username that is preceded by an @ symbol. 
	 *   (for example @david would show the tweet on david's timeline) 
	 * You are not limited to tagging only one user in your tweet, 
	 *   however everything must still fit within the 180 character limit. 
	 * The tweet will also keep track of whether or not the specific 
	 *   tweet is public.
	 * The tweet is aware of it's author.
	 */
	
}
