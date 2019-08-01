package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends Activity implements View.OnClickListener {

	EditText personsEmail, intro, personsName, stupidThings, hatefulAction,
			outro, names;
	String emailAdd, hometeam, awayteam, finalscore, othernotes, report,
			scorers;
	Button sendEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}

	private void initializeVars() {
		// TODO Auto-generated method stub
		intro = (EditText) findViewById(R.id.etIntro);
		personsName = (EditText) findViewById(R.id.etName);
		stupidThings = (EditText) findViewById(R.id.etThings);
		hatefulAction = (EditText) findViewById(R.id.etAction);
		outro = (EditText) findViewById(R.id.etOutro);
		names = (EditText) findViewById(R.id.etScorers);
		sendEmail = (Button) findViewById(R.id.bSentEmail);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub

		convertEditTextVarsIntoStrings();
		String emailaddress[] = { emailAdd };
		String message = " "

		+ " (HOME TEAM):" + hometeam + "  " + " (AWAY TEAM):" + awayteam + "  "
				+ "(FINAL SCORE):" + finalscore + "  " + "(GOALSCORERS):" + report + "  "
				+ "(REPORT):" + scorers + "  " + "(OTHER NOTES):"
				+ othernotes;

		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"HOCKEY MATCH REPORT");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
	}

	private void convertEditTextVarsIntoStrings() {
		// TODO Auto-generated method stub
		emailAdd = "noonanni@tcd.ie";
		hometeam = intro.getText().toString();
		awayteam = personsName.getText().toString();
		finalscore = stupidThings.getText().toString();
		report = hatefulAction.getText().toString();
		othernotes = outro.getText().toString();
		scorers = names.getText().toString();

	}

}