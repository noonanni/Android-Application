package com.example.hookhockey;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContactsActivity extends ListActivity {

	String classes[] = { "Abbeyleix Hockey Club", "Avoca Hockey Club",
			"Botanic Hockey Club", "Bray Hockey Club", "Boyne Hockey Club",
			"Carlow Hockey Club", "Clontarf Hockey Club",
			"Corinthians Hockey Club", "Dublin Uni Hockey Club (DUHC)",
			"Dublin Uni Ladies Hockey Club (DULHC)",
			"Dalkey Junior Hockey Club", "Enniscorthy Hockey Club",
			"Fingal Hockey Club", "Genesis Hockey Club",
			"Glennane Hockey Club", "Gorey Hockey Club",
			"Guinness Hockey Club", "Hermes Hockey Club",
			"Kilkenny Hockey Club", "Loreto Hockey Club",
			"Malahide Hockey Club", "Monkstown Hockey Club",
			"Mount Anville Hockey Club", "Muckross Hockey Club",
			"Mullingar Hockey Club", "Nass Hockey Club",
			"Navan(Men) Hockey Club", "Navan(Ladies) Hockey Club",
			"Newbridge Hockey Club", "North Kildare Hockey Club",
			"Old Alexandra Hockey Club", "Our Ladys Hockey Club",
			"Pembroke Wanderers Hockey Club","Portlaoise Hockey Club",
			"Railway Union Hockey Club", "Rathgar Hockey Club",
			"Skerries Hockey Club", "St Brendans Hockey Club",
			"St James's Gate Hockey Club", "Suttonians Hockey Club",
			"Swords Hockey Club", "Three Rock Rovers Hockey Club",
			"Tullamore Hockey Club", "UCD Ladies Hockey Club",
			"UCD Mens Hockey Club", "Weston Hockey Club",
			"Wexford Hockey Club", "Wicklow Hockey Club", "YMCA Hockey Club" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(ContactsActivity.this,
				android.R.layout.simple_list_item_1, classes));

	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String cheese = classes[position];

		if (cheese.equals("Abbeyleix Hockey Club"))
			cheese = "Abbey";
		if (cheese.equals("Avoca Hockey Club"))
			cheese = "Avoca";
		if (cheese.equals("Botanic Hockey Club"))
			cheese = "Botanic";
		if (cheese.equals("Bray Hockey Club"))
			cheese = "Bray";
		if (cheese.equals("Boyne Hockey Club"))
			cheese = "Boyne";
		if (cheese.equals("Carlow Hockey Club"))
			cheese = "Carlow";
		if (cheese.equals("Clontarf Hockey Club"))
			cheese = "Clontarf";
		if (cheese.equals("Corinthians Hockey Club"))
			cheese = "Corinthians";
		if (cheese.equals("Dublin Uni Hockey Club (DUHC)"))
			cheese = "Dublin_University";
		if (cheese.equals("Dublin Uni Ladies Hockey Club (DULHC)"))
			cheese = "DublinLadies";
		if (cheese.equals("Dalkey Junior Hockey Club"))
			cheese = "Dalkey_Junior";
		if (cheese.equals("Enniscorthy Hockey Club"))
			cheese = "Enniscorthy";
		if (cheese.equals("Fingal Hockey Club"))
			cheese = "Fingal";
		if (cheese.equals("Genesis Hockey Club"))
			cheese = "Genesis";
		if (cheese.equals("Glennane Hockey Club"))
			cheese = "Glennane";
		if (cheese.equals("Gorey Hockey Club"))
			cheese = "Gorey";
		if (cheese.equals("Guinness Hockey Club"))
			cheese = "Guinness";
		if (cheese.equals("Hermes Hockey Club"))
			cheese = "Hermes";
		if (cheese.equals("Kilkenny Hockey Club"))
			cheese = "Kilkenny";
		if (cheese.equals("Loreto Hockey Club"))
			cheese = "Loreto";
		if (cheese.equals("Malahide Hockey Club"))
			cheese = "Malahide";
		if (cheese.equals("Monkstown Hockey Club"))
			cheese = "Monkstown";
		if (cheese.equals("Mount Anville Hockey Club"))
			cheese = "Mount";
		if (cheese.equals("Muckross Hockey Club"))
			cheese = "Muckross";
		if (cheese.equals("Mullingar Hockey Club"))
			cheese = "Mullingar";
		if (cheese.equals("Nass Hockey Club"))
			cheese = "Nass";
		if (cheese.equals("Navan(Men) Hockey Club"))
			cheese = "Navan_Men";
		if (cheese.equals("Navan(Ladies) Hockey Club"))
			cheese = "NavanLadies";
		if (cheese.equals("Newbridge Hockey Club"))
			cheese = "Newbridge";
		if (cheese.equals("North Kildare Hockey Club"))
			cheese = "North_Kildare";
		if (cheese.equals("Old Alexandra Hockey Club"))
			cheese = "Old_Alexandra";
		if (cheese.equals("Our Lady's Hockey Club"))
			cheese = "Our_Ladys";
		if (cheese.equals("Pembroke Wanderers Hockey Club"))
			cheese = "Pembroke";
		if (cheese.equals("Portlaiose Hockey Club"))
			cheese = "Portlaoise";
		if (cheese.equals("Railway Union Hockey Club"))
			cheese = "Railway";
		if (cheese.equals("Rathgar Hockey Club"))
			cheese = "Rathgar";
		if (cheese.equals("Skerries Hockey Club"))
			cheese = "Skerries";
		if (cheese.equals("St Brendans Hockey Club"))
			cheese = "St_Brendans";
		if (cheese.equals("St James's Gate Hockey Club"))
			cheese = "Jamess_Gate";
		if (cheese.equals("Suttonians Hockey Club"))
			cheese = "Suttonians";
		if (cheese.equals("Swords Hockey Club"))
			cheese = "Swords";
		if (cheese.equals("Three Rock Rovers Hockey Club"))
			cheese = "Three_Rock_Rovers";
		if (cheese.equals("Tullamore Hockey Club"))
			cheese = "Tullamore";
		if (cheese.equals("UCD Mens Hockey Club"))
			cheese = "UCD_Ladies";
		if (cheese.equals("UCD Ladies Hockey Club"))
			cheese = "UCD_Mens";
		if (cheese.equals("Weston Hockey Club"))
			cheese = "Weston";
		if (cheese.equals("Wexford Hockey Club"))
			cheese = "Wexford";
		if (cheese.equals("Wicklow Hockey Club"))
			cheese = "Wicklow";
		if (cheese.equals("YMCA Hockey Club"))
			cheese = "YMCA";

		super.onListItemClick(l, v, position, id);
		try {

			// Replace with "android.intent.action.MAINACTIVITY" if doesn't
			// work//
			Class ourClass = Class.forName("com.example.hookhockey." + cheese);
			Intent ourIntent = new Intent(ContactsActivity.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}
	}

}