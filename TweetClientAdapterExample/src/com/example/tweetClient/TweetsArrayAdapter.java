package com.example.tweetClient;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.helloworld.R;
import com.loopj.android.image.SmartImageView;

public class TweetsArrayAdapter extends ArrayAdapter<Tweet> {
	
	public TweetsArrayAdapter(Context context, List<Tweet> objects)
	{
		super(context,0,objects);
	}
	
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater vi=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v=vi.inflate(R.layout.tweet_item, null);
		
		
		Tweet t=this.getItem(position);
		TextView tvUserName=(TextView)v.findViewById(R.id.tvUserName);
		TextView tvBody=(TextView)v.findViewById(R.id.tvBody);
		
		tvUserName.setText(t.getUser().getUserName());
		tvBody.setText(t.getBody());
		
		SmartImageView ivImage=(SmartImageView)v.findViewById(R.id.ivProfileImage);
		ivImage.setImageUrl(t.getUser().getProfilePictureUrl());
		return v;
	}

}