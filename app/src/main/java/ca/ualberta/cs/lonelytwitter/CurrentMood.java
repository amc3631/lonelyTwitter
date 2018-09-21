package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {

    protected Date date;
    protected String message;

    public CurrentMood(Date date, String message){
        this.date = date;
        this.message = message;
    }

    public CurrentMood(String message){
        this.date = new Date();
        this.message = message;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public Date getdate(){
        return this.date;
    }

}
