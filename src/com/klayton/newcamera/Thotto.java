package com.klayton.newcamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Thotto extends Activity {
	Button b;
	public String lol;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thotto);
		b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				
				Intent i = getIntent();
				Bundle b = i.getExtras();
				
				if(b!=null)
		        {
		            lol =(String) b.get("name");
		            Toast.makeText(getApplicationContext(), lol, Toast.LENGTH_LONG).show();
		            
		        }
				
				
				
			}
		});
		
	}

}
