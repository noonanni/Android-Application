package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Dalkey_Junior extends Activity implements View.OnClickListener {

	String emailAdd = "noonanni@tcd.ie";
	Button gpsLocation, email, call;

	String emailaddress[] = { emailAdd };

	// public void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated()
	// {
	// TODO Auto-generated method stub
	// emailAdd = "  ";}

	public void onCreate(Bundle savedInstanceState)

	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loretojunior);

		
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
					Uri.parse("geo:<53.279605>,<-6.099885>?q=<53.279605>,<-6.099885>(Dalkey Junior Hockey Club+Loreto Abbey Dalkey)"));
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

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}