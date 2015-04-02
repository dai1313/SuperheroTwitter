import java.util.*;
import java.text.*;

public class Tweet {
	
	private String author = "";
	private String body = "";
	private boolean pubTweet = true;
	//private String[] tags = {""};
	public String tags = "";
	
	//public Tweet (String author, String body, boolean public, ???) {}
		//how do I make a string array parameter?
		//or do I just want to have a string that it deliniated by commas?
	
	public Tweet (String fileline) {
		String[] split = fileline.split(" ");
		author = split[0];
		body = split[1];
		pubTweet = Boolean.parseBoolean(split[2]);
			//!!!!!!!! parse this!
		//tags = split[3];
		tags = "";
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
