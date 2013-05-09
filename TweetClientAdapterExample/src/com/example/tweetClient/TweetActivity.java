package com.example.tweetClient;

import com.example.helloworld.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class TweetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tweet);
		String bodyString=getIntent().getStringExtra("body");
		TextView textView=(TextView)findViewById(R.id.txtView1);
		textView.setText(bodyString);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tweet, menu);
		return true;
	}

}
