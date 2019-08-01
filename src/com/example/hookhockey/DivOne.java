package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DivOne extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.divone);


WebView engine = (WebView) findViewById(R.id.divOne);  
engine.loadUrl("http://www.hookhockey.com/index.php/mens-div-1-league/#.Uvu8Y_l_tx0"); 

WebView myWebView = (WebView) findViewById(R.id.divOne);
myWebView.setWebViewClient(new WebViewClient());

}
}
