package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){super(LonelyTwitterActivity.class);}

    public void testAddTweet(){
       // assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet((tweet)));
    }

    public void testDeleteTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet((tweet)));
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
       // assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testHasTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

}
