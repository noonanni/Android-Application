package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Podcasts extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.podcasts);


WebView engine = (WebView) findViewById(R.id.pod);  
engine.loadUrl("http://www.hookhockey.com/index.php/the-hook-and-dublin-city-fm-podcasts/#.Uvu2X_l_tx0"); 

WebView myWebView = (WebView) findViewById(R.id.pod);
myWebView.setWebViewClient(new WebViewClient());

}
}
