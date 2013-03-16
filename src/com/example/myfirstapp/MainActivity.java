package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"; //use package name as a prefix

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /**
     * Called when the user clicks the Send button
     * @param view
     */
    public void sendMessage(View view){
    	// the intent binds this view to the other view we want to display
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	
    	// gets the EditText
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	
    	// gets the message from the EditText
    	String message = editText.getText().toString();
    	
    	// this is like adding the message to the viewbag of the new activity.  
    	// Key-value pair
    	intent.putExtra(EXTRA_MESSAGE, message);
    	
    	// start the new activity
    	startActivity(intent); 	
    }
    
    
}
