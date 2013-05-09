package com.example.tweetClient;

import com.example.helloworld.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
//test github push
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onButton(View view)
    {
    	Log.d("Hello  Click", "Someone Clicked My Button!");
    }
    

	@Override
	protected void onPause() {
		//super.onPause();
		Log.d("Whatever", "onPause");
	}

	@Override
	protected void onResume() {
		//super.onResume();
		Log.d("Whatever", "onResume");
	}
    
}
