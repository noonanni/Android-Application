package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Railway extends Activity {

	FlyOutContainer root;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.railway, null);

		this.setContentView(root);
		
		
			WebView engine = (WebView) findViewById(R.id.webrail);
		engine.loadUrl("https://twitter.com/RailwayUnionHC");

		WebView myWebView = (WebView) findViewById(R.id.webrail);
		myWebView.setWebViewClient(new WebViewClient());
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sample, menu);
		return true;
	}

	public void toggleMenu(View v){
		this.root.toggleMenu();
	}

}