package com.example.hookhockey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ResultsFixtures extends Activity implements View.OnClickListener {

	Button DivOne;
	Button DivTwo;
	Button DivThree;
	FlyOutContainer root;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		this.root = (FlyOutContainer) this.getLayoutInflater().inflate(
				R.layout.fixtures2, null);

		this.setContentView(root);

		WebView engine = (WebView) findViewById(R.id.fixit);
		engine.loadUrl("http://www.hookhockey.com/index.php/mens-div-1-league/#.Uvu8Y_l_tx0");
		
		WebView myWebView = (WebView) findViewById(R.id.webrail);
		myWebView.setWebViewClient(new WebViewClient());
		
		

		initializeVars();
		DivOne.setOnClickListener(this);
		DivTwo.setOnClickListener(this);
		DivThree.setOnClickListener(this);

	}

	private void initializeVars() {
		DivOne = (Button) findViewById(R.id.one);
		DivTwo = (Button) findViewById(R.id.two);
		DivThree = (Button) findViewById(R.id.three);
	}

	public void onClick(View view) {

		switch (view.getId()) {

		case R.id.one:

			Intent DivOne = new Intent(ResultsFixtures.this, DivOne.class);
			startActivity(DivOne);

			break;

		case R.id.two:

			Intent DivTwo = new Intent(ResultsFixtures.this, DivTwo.class);
			startActivity(DivTwo);

			break;

		case R.id.three:

			Intent DivThree = new Intent(ResultsFixtures.this, DivThree.class);
			startActivity(DivThree);

		}

	}

}
