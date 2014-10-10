package com.example.jewproduction1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

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
    public void HandleTriangles(View item){
    	TextView ref_price = (TextView)findViewById(R.id.cena1);
    	TextView AllTriangles = (TextView)findViewById(R.id.AllTriangles);
    	TextView HowMuchTriangles = (TextView)findViewById(R.id.HowMuchTriangles);
    	TextView Result = (TextView)findViewById(R.id.CalcedTriangles);
    	if(AllTriangles.getText().length() != 0 &&
    	   HowMuchTriangles.getText().length() !=0 &&
    	   ref_price.getText().length() != 0){
    		double cena = Double.parseDouble(ref_price.getText().toString());
        	int alles = Integer.parseInt(AllTriangles.getText().toString());
        	int single = Integer.parseInt(HowMuchTriangles.getText().toString());
        	double unitprice = cena*single/alles;
    		String message = new String("Oddaj ziomeczkowi "+unitprice+" zł");
    		Result.setText(message);
    	}
        else{
    		Result.setText(new String("Podaj poprawną cenę i liczbę kawałków."));
        }
    }
    public void onPizzaSetted(View item){
    	TextView ref_size_1 = (TextView)findViewById(R.id.rozmiar1);
    	TextView ref_price_1 = (TextView)findViewById(R.id.cena1);
    	TextView ref_size_2= (TextView)findViewById(R.id.rozmiar2);
    	TextView ref_price_2= (TextView)findViewById(R.id.cena2);
    	
    	if(ref_price_1.getText().length() !=0 &&
    	   ref_size_1.getText().length() !=0 &&
    	   ref_size_2.getText().length() !=0){
    		double cena1 = Double.parseDouble(ref_price_1.getText().toString());
        	double rozmiar1 = Double.parseDouble(ref_size_1.getText().toString());
        	double rozmiar2 = Double.parseDouble(ref_size_2.getText().toString());
        	double price2 = cena1*(rozmiar2*rozmiar2)/(rozmiar1*rozmiar1);
            price2 = cena1*(rozmiar2*rozmiar2)/(rozmiar1*rozmiar1);
        	ref_price_2.setText(String.valueOf(price2));
        	//uyvgfc
        }
    	else{
    		ref_price_2.setText(new String("Podaj poprawny rozmiar i cenę pizzy."));
        }
    }
}

