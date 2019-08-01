package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class NewsActivity extends Activity implements View.OnClickListener {

	Button RssFeed;
	Button RssFeed2;
	Button RssFeed3;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);

		initializeVars();
		RssFeed.setOnClickListener(this);
		RssFeed2.setOnClickListener(this);
		RssFeed3.setOnClickListener(this);

		WebView engine = (WebView) findViewById(R.id.web_engine);
		engine.loadUrl("http://www.hookhockey.com/index.php/category/leinster/#.UuERjxDFLnA");

	}

	private void initializeVars() {
		RssFeed = (Button) findViewById(R.id.btnLoad);
		RssFeed2 = (Button) findViewById(R.id.btnLoad2);
		RssFeed3 = (Button) findViewById(R.id.btnLoad3);
	}

	public void onClick(View view) {

		switch (view.getId()) {

		case R.id.btnLoad3:

			Intent RssFeed3 = new Intent(NewsActivity.this, RSSNewsFeed3.class);
			startActivity(RssFeed3);

			break;

		case R.id.btnLoad2:

			Intent RssFeed2 = new Intent(NewsActivity.this, RSSNewsFeed2.class);
			startActivity(RssFeed2);

			break;

		case R.id.btnLoad:

			Intent RssFeed = new Intent(NewsActivity.this, RSSNewsFeed.class);
			startActivity(RssFeed);

		}

	}

}
