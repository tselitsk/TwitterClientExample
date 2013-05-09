package com.example.tweetClient;

import com.example.helloworld.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TimelineActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timeline);

		TweetsArrayAdapter ta=new TweetsArrayAdapter(this, Tweet.fakeTweets());
		ListView lv=(ListView)findViewById(R.id.lvTimeline);
		lv.setAdapter(ta);
		
		lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> listView, View arg1, int position,
					long arg3) {
				Tweet t=(Tweet)listView.getAdapter().getItem(position);
				Toast.makeText(getBaseContext(), t.getUser().getUserName(),Toast.LENGTH_LONG).show();
				Intent intent=new Intent(getBaseContext(), TweetActivity.class);
				String bodyString=t.getBody();
				intent.putExtra("body", bodyString);
				startActivity(intent);
			}
		
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_timeline, menu);
		return true;
	}


}