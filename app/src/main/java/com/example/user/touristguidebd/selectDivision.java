package com.example.user.touristguidebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class selectDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_division);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_division, menu);
        return true;
    }

    public void rangpur(View view) {
        Intent intent = new Intent(this,Rangpur.class);
        startActivity(intent);
    }

    public void rajshahi(View view) {
        Intent intent = new Intent(this,Rajshahi.class);
        startActivity(intent);
    }

    public void barisal(View view) {
        Intent intent = new Intent(this,Barisal.class);
        startActivity(intent);
    }

    public void chittagong(View view) {
        Intent intent = new Intent(this,Chittagong.class);
        startActivity(intent);
    }

    public void khulna(View view) {
        Intent intent = new Intent(this,Khulna.class);
        startActivity(intent);
    }

    public void sylhet(View view) {
        Intent intent = new Intent(this,Sylhet.class);
        startActivity(intent);
    }

    public void mymensingh(View view) {
        Intent intent = new Intent(this,Mymensingh.class);
        startActivity(intent);
    }

    public void dhaka(View view) {
        Intent intent = new Intent(this,Dhaka.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
