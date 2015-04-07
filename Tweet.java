import java.util.*;
import java.text.*;

public class Tweet {
	protected String author = "";
	protected String body = "";
	protected boolean pubTweet = true;
	protected ArrayList<String> tags = new ArrayList<String>();

	
	public Tweet (String authorp, String bodyp, boolean pubTweetp, ArrayList<String> tags) {
		author = authorp;
		body = bodyp;
		pubTweet = pubTweetp;
		
		//break up the following and fill array list
		for (String singleTag: tags.toString().split(",")) {
			tags.add(singleTag);
		}
	}
	
	
	public Tweet (String fileline) {
		String[] split = fileline.split(" ");
		author = split[0];
		body = split[1];
		pubTweet = Boolean.parseBoolean(split[2]);
		
		//break up the following and fill array list
		for (String singleTag: split[3].split(",")) {
			tags.add(singleTag);
		}
	}
	
	
	public String toString() {
		//remove the brackets from the array list toString()
		String tagsf = tags.toString();
		tagsf = tagsf.substring(1,tagsf.length()-1);
		
		//strip out the spaces
		tagsf = tagsf.replaceAll("\\s","");
		
		String ret = (author + " " + body + " " + pubTweet + " " + tagsf);
		return ret;
	}
	//we need a constructor that takes a string here
	//we also need a toString()
	//the output of toString() should be able to be read by the string constructor
	//this way file I/O will be a lot smoother

//---getters and setters----------------------------------------------
        //author getter
        public String getAuthor() {
            return author;
        }
        //author setter
        public void setAuthor(String newAuthor) {
            author = newAuthor;
        }


        //body getter
        public String getBody() {
            return body;
        }
        //body setter
        public void setBody(String newBody) {
            body = newBody;
        }


        //pubTweet getter
        public boolean getPubTweet() {
            return pubTweet;
        }
        //pubTweet setter
        public void setPubTweet(boolean newPubTweet) {
            pubTweet = newPubTweet;
        }


        //tags getter
        public ArrayList<String> getTags() {
            return tags;
        }
        //tags setter
        public void setTags(ArrayList<String> newTags) {
            tags = newTags;
        }

//---------------------------------------------------------------------
	
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
