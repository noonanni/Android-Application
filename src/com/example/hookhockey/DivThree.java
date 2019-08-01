package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DivThree extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.divthree);

		WebView engine = (WebView) findViewById(R.id.divThree);
		engine.loadUrl("http://www.hookhockey.com/index.php/mens-division-three/#.UvvBhvl_tx0");

		WebView myWebView = (WebView) findViewById(R.id.divThree);
		myWebView.setWebViewClient(new WebViewClient());
	
	
	}
}
