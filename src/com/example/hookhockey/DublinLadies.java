package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DublinLadies extends Activity implements View.OnClickListener {

	String emailAdd = "noonanni@tcd.ie";
	Button gpsLocation, email, call;

	String emailaddress[] = { emailAdd };
	FlyOutContainer root;
	// public void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated()
	// {
	// TODO Auto-generated method stub
	// emailAdd = "  ";}

	public void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.dublinladies, null);

		this.setContentView(root);
		
		
			WebView engine = (WebView) findViewById(R.id.webrail);
		engine.loadUrl("https://twitter.com/DULHC");

		WebView myWebView = (WebView) findViewById(R.id.webrail);
		myWebView.setWebViewClient(new WebViewClient());;
		initializeVars();
		gpsLocation.setOnClickListener(this);
		email.setOnClickListener(this);
		call.setOnClickListener(this);
	}

	private void initializeVars() {
		// TODO Auto-generated method stub
		gpsLocation = (Button) findViewById(R.id.btnMap);
		email = (Button) findViewById(R.id.mail);
		call = (Button) findViewById(R.id.btnDial);

	}

	@Override
	public void onClick(View view) {

		switch (view.getId()) {

		case R.id.btnMap:

			Intent locate = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("geo:<53.40115>,<-6.25471>?q=<53.40115>,<-6.25471>(Dublin University+Santry Sports Ground)"));
			startActivity(locate);

			break;

		case R.id.mail:

			Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
			emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL,
					emailaddress);
			emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, " ");
			emailIntent.setType("plain/text");
			emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, " ");
			startActivity(emailIntent);

			break;

		case R.id.btnDial:
			Intent RingRing = new Intent(android.content.Intent.ACTION_DIAL);
			startActivity(RingRing);

			break;

		}
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sample, menu);
		return true;
	}

	public void toggleMenu(View v){
		this.root.toggleMenu();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}