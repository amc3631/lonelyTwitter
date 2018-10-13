package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends CurrentMood {

    public Happy(Date date, String message){
        super(date,message);
    }

    public Happy(String message){
        super(message);
    }

    private String Mood(){
        return "I am happy :)";
    }
}
