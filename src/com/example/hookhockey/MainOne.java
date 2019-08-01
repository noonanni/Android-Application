package com.example.hookhockey;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;


public class MainOne extends TabActivity {

	private TabHost mTabHost;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		Resources res = getResources();
		mTabHost= getTabHost();
		TabHost.TabSpec spec;
		Intent intent ;
		
		//Home Tab
		intent = new Intent (this, HomeActivity.class);
		
		spec = mTabHost.newTabSpec("home")
				.setIndicator("Home")
				.setContent(intent);
		mTabHost.addTab(spec);
		
		//News Tab
intent = new Intent (this, SampleActivity.class);
		
		spec = mTabHost.newTabSpec("news")
				.setIndicator("News")
				.setContent(intent);
		mTabHost.addTab(spec);
		
		//Contacts Tab
intent = new Intent (this, ContactsActivity.class);
		
		spec = mTabHost.newTabSpec("contacts")
				.setIndicator("Clubs")
				.setContent(intent);
		mTabHost.addTab(spec);
		

		
intent = new Intent (this, MessageActivity.class);
		
		spec = mTabHost.newTabSpec("message")
				.setIndicator("Match")
				.setContent(intent);
		mTabHost.addTab(spec);
		
		
intent = new Intent (this, MoreActivity.class);
		
		spec = mTabHost.newTabSpec("more")
				.setIndicator("More")
				.setContent(intent);
		mTabHost.addTab(spec);
		
		
		
		
		
		
		
	}
	
}