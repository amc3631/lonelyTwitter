package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private List emotions;

    //Empty argument constructor with default values
    Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
        List<CurrentMood> emotions = new ArrayList<CurrentMood>();
        this.date = new Date();
        this.message = "I am default message schwa!";
    }

    //Overloading: so that we can specify the tweet content
    Tweet(String message) {
        List<String> emotions = new ArrayList<String>();
        this.date = new Date();
        this.message = message;
    }

    public void addEmotion(CurrentMood emotion){
        emotions.add(emotion);
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws MaxTextLength {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new MaxTextLength();
        }
    }

    public Date getDate() { return this.date; }

    public void setDate(Date date){
        this.date = date;
    }
    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    public abstract Boolean isImportant();

    public String toString(){
        return this.date.toString()+"|" +this.message;
    }

}
