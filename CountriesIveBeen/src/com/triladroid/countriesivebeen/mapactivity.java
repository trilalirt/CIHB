package com.triladroid.countriesivebeen;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class mapactivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maplayout);
		
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		Boolean showcountry1 = preferences.getBoolean("checkboxpref1", true);
		
		if (!showcountry1)
		{
			ImageView country1 = (ImageView) findViewById(R.id.imageView1);
			country1.setVisibility(View.INVISIBLE);
			
		}
		
		
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
