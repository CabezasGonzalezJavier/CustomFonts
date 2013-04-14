package com.example.customfonts;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class TheDeveloperWorldIsYours extends Activity {
	private TextView text1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_developer_world_is_yours);
        
        text1 = (TextView) findViewById(R.id.textView);  
        text1.setText("Chantelli_Antiqua");
        
        Typeface font = Typeface.createFromAsset(getAssets(), "Chantelli_Antiqua.ttf");
        text1.setTypeface(font); 
    }

    
}
