package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SampleActivity extends Activity implements OnClickListener {

	FlyOutContainer root;
	Button RssFeed,RssFeed2,RssFeed3,RssFeed4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.activity_sample, null);
		
		this.setContentView(root);
		
		
		WebView engine = (WebView) findViewById(R.id.webView10);
		engine.loadUrl("http://www.hookhockey.com/index.php/category/leinster/#.UuERjxDFLnA");
		
		
		
		
		WebView myWebView = (WebView) findViewById(R.id.webView10);
		myWebView.setWebViewClient(new WebViewClient());
		
		
		initializeVars();
		RssFeed.setOnClickListener(this);
		RssFeed2.setOnClickListener(this);
		RssFeed3.setOnClickListener(this);
        RssFeed4.setOnClickListener(this);
	}
		private void initializeVars() {
			  
			  RssFeed = (Button) findViewById(R.id.btnLoad);
			  RssFeed2 =(Button) findViewById(R.id.btnLoad2);
			  RssFeed3 =(Button) findViewById(R.id.btnLoad3);
              RssFeed4=(Button) findViewById(R.id.btnLoad4);
			 }
			  
			  
			  public void onClick(View view) { // TODO Auto-generated method stub
			  switch (view.getId()){
			  
			  case R.id.btnLoad:
			  
				  Intent RssFeed = new Intent(SampleActivity.this,RSSNewsFeed.class);
					startActivity(RssFeed);
					
			  break;
			  
			  case R.id.btnLoad2:
				  
				  Intent RssFeed2 = new Intent(SampleActivity.this,RSSNewsFeed2.class);
					startActivity(RssFeed2);
			  
			  break;
			  
			  case R.id.btnLoad3:
				  
				  Intent RssFeed3 = new Intent(SampleActivity.this,RSSNewsFeed3.class);
				  startActivity(RssFeed3);
			  
			  break;
			  
			  case R.id.btnLoad4:
				  
				  Intent RssFeed4 = new Intent (SampleActivity.this,RSSNewsFeed4.class);
				  startActivity(RssFeed4);
			  
			  }
			  
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
