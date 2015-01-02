package com.example.sawsdl_parser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.ow2.easywsdl.extensions.sawsdl.SAWSDLFactory;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		try {
			parseSAWSDL_Test();
		} catch (SAWSDLException | IOException
				| URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void parseSAWSDL_Test() throws SAWSDLException, MalformedURLException, IOException, URISyntaxException
	{
		long startTime = System.currentTimeMillis();
		
		SAWSDLReader sreader = SAWSDLFactory.newInstance().newSAWSDLReader();
		org.ow2.easywsdl.extensions.sawsdl.api.Description sdesc = sreader.read(new URL("http://www.w3schools.com/webservices/tempconvert.asmx?WSDL"));
		
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime+" msec");
	}
}
