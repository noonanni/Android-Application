package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class ContactUs extends Activity {

	 
	
	String emailAdd;
	
	public void onCreate(Bundle savedInstanceState){
	
		
		convertEditTextVarsIntoStrings();
		String emailaddress[] = { emailAdd };
		String message = " ";

		
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Hook Hockey");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
	

super.onCreate(savedInstanceState);
setContentView(R.layout.news);

}
	
	private void convertEditTextVarsIntoStrings() {
		// TODO Auto-generated method stub
		emailAdd = "noonanni@tcd.ie";
	
	
	
	
}
}