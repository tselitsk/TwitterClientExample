package com.example.tweetClient;

import java.util.ArrayList;

public class Tweet {
	
	private User user;
	private String body;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public static ArrayList<Tweet> fakeTweets()
	{
		ArrayList<Tweet> tweets=new ArrayList<Tweet>();
		Tweet t=new Tweet();
		t.body="OMG, I mega love tweeting, holy cow!!";
		
		User u=new User();
		u.setProfilePictureUrl("https://si0.twimg.com/profile_images/1334286403/my_pic_bigger.jpg");
		u.setUserName("Talia Selitsky");
		t.setUser(u);
		tweets.add(t);
		
		return tweets;
		
	}

	
	

}
