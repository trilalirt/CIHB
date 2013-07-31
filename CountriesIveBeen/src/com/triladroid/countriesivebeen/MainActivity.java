package com.triladroid.countriesivebeen;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;



public class MainActivity extends PreferenceActivity {

	public CheckBox Checkbox1; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.preferences);
        // Get the custom preference
        //ok
		
		
		Preference okpref = (Preference) findPreference("ok"); 
		okpref.setOnPreferenceClickListener(new OnPreferenceClickListener()
		{
		public boolean onPreferenceClick(Preference preference)
		{
			Intent myIntent = new Intent(getApplicationContext(), mapactivity.class);
			startActivity(myIntent);
			return true;
		}
		});
		
		//Button mapbutton = (Button) findViewById(R.id.button1);
		
//		mapbutton.setOnClickListener(
//				new OnClickListener()
//				{
//					public void onClick (View v)
//					{
//						Intent myIntent = new Intent(getApplicationContext(), mapactivity.class);
//						startActivity(myIntent);
//					}
//				});
//		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
