package com.example.hookhockey;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MoreActivity extends ListActivity {

	String classes[] = { "Contact the Hook", "Club Noticeboard",
			"League Tables", "Results & Fixtures", "Interviews",
			"Umpires", "Dublin City Podcasts","About" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MoreActivity.this,
				android.R.layout.simple_list_item_1, classes));

	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String cheese = classes[position];

		if (cheese.equals("Contact the Hook"))
			cheese = "ContactUs";
		if (cheese.equals("Club Noticeboard"))
			cheese = "Noticeboard";
		if (cheese.equals("League Tables"))
			cheese = "League";
		if (cheese.equals("Results & Fixtures"))
			cheese = "ResultsFixtures";
		if (cheese.equals("About"))
			cheese = "About";
		if (cheese.equals("Interviews"))
			cheese = "Interviews";
		if (cheese.equals("Umpires"))
			cheese = "Umpires";
		if (cheese.equals("Dublin City Podcasts"))
			cheese = "Podcasts";
		
		
		
		
		
		
		
		super.onListItemClick(l, v, position, id);
		try {

			// Replace with "android.intent.action.MAINACTIVITY" if doesn't
			// work//
			Class ourClass = Class.forName("com.example.hookhockey." + cheese);
			Intent ourIntent = new Intent(MoreActivity.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}
	}

}