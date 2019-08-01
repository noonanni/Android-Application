package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DivTwo extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.divtwo);

		WebView engine = (WebView) findViewById(R.id.divTwo);
		engine.loadUrl("http://www.hookhockey.com/index.php/mens-leinster-senior-div-2/#.UvvAY_l_tx0");

		
		WebView myWebView = (WebView) findViewById(R.id.divTwo);
		myWebView.setWebViewClient(new WebViewClient());
		
	}
}
