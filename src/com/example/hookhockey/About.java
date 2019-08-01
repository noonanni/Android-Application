package com.example.hookhockey;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends Activity {

	@Override 
	
	public void onCreate(Bundle savedInstanceState){
	
		 
	

super.onCreate(savedInstanceState);
setContentView(R.layout.news);


WebView engine = (WebView) findViewById(R.id.web_engine);  
engine.loadUrl("http://www.hookhockey.com/index.php/category/features/about/#.UuP1ERDFLnA"); 



}
}