package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class HomeActivity extends Activity implements View.OnClickListener {

	ImageButton edSports, twitter, facebook, RssFeed, LeagueTable;
	 FlyOutContainer root;

	String ed = "http://edsports.ie/hockey";
	String twit = "https://twitter.com/hookhockey";
	String face = "https://www.facebook.com/pages/The-Hook-Leinster-hockeys-only-blog/119946038055241?ref=ts";

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.testhome, null);

		this.setContentView(root);
		
		WebView engine = (WebView) findViewById(R.id.webLeague);
		engine.loadUrl("http://www.hookhockey.com/index.php/all-leagues/#.Uw-ujvl_tx1");

		WebView myWebView = (WebView) findViewById(R.id.webLeague);
		myWebView.setWebViewClient(new WebViewClient());
		
		

		initializeVars();
		edSports.setOnClickListener(this);
		twitter.setOnClickListener(this);
		facebook.setOnClickListener(this);
		RssFeed.setOnClickListener(this);
		LeagueTable.setOnClickListener(this);

	}

	private void initializeVars() {
		edSports = (ImageButton) findViewById(R.id.btnEd);
		twitter = (ImageButton) findViewById(R.id.twitterbtn);
		facebook = (ImageButton) findViewById(R.id.facebookbtn);
		RssFeed = (ImageButton) findViewById(R.id.btnLoad);
		LeagueTable = (ImageButton) findViewById(R.id.btnLoad);

	}
	
	public void toggleMenu(View v){
		this.root.toggleMenu();
		
	}

	@Override
	public void onClick(View view) {

		switch (view.getId()) {

		case R.id.btnEd:

			Intent edSports = new Intent(android.content.Intent.ACTION_VIEW);
			edSports.setData(Uri.parse(ed));
			startActivity(edSports);
			break;

		case R.id.twitterbtn:

			Intent twitter = new Intent(android.content.Intent.ACTION_VIEW);
			twitter.setData(Uri.parse(twit));
			startActivity(twitter);

			break;

		case R.id.facebookbtn:

			Intent facebook = new Intent(android.content.Intent.ACTION_VIEW);
			facebook.setData(Uri.parse(face));
			startActivity(facebook);

			break;

		case R.id.btnLoad:

			Intent RssFeed = new Intent(HomeActivity.this, RSSNewsFeed.class);
			startActivity(RssFeed);

		}
	}
	
	
	

}