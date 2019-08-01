package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Umpires extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.umpires);


WebView engine = (WebView) findViewById(R.id.ump);  
engine.loadUrl("http://www.hookhockey.com/index.php/category/features/umpires/#.Uvu1q_l_tx0"); 

WebView myWebView = (WebView) findViewById(R.id.ump);
myWebView.setWebViewClient(new WebViewClient());

}
}
