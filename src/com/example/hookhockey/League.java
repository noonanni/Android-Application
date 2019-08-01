package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class League extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.news);


WebView engine = (WebView) findViewById(R.id.web_engine);  
engine.loadUrl("http://www.hookhockey.com/index.php/all-leagues/#.UuKLHBDFLnA"); 

WebView myWebView = (WebView) findViewById(R.id.web_engine);
myWebView.setWebViewClient(new WebViewClient());

}
}
