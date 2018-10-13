package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends CurrentMood {

    public Sad(Date date, String message){
        super(date,message);
    }

    public Sad(String message){
        super(message);
    }

    private String Mood(){
        return "I am sad :(";
    }
}

