package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Interviews extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.interviews);


WebView engine = (WebView) findViewById(R.id.inter);  
engine.loadUrl("http://www.hookhockey.com/index.php/category/features/interviews/#.UvuzD_l_tx0"); 

WebView myWebView = (WebView) findViewById(R.id.inter);
myWebView.setWebViewClient(new WebViewClient());

}
}
