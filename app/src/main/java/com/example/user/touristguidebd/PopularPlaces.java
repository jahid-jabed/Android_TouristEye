package com.example.user.touristguidebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PopularPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_places);
    }

    public void cox(View view){
        Intent intent = new Intent(this,Event.class);
        //intent.putExtra("KEY", 1);
        intent.putExtra("KEY",1);
        startActivity(intent);
    }

    public void ahsan(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",8);
        startActivity(intent);
    }

    public void sajek(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",2);
        startActivity(intent);
    }

    public void jaflong(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",3);
        startActivity(intent);
    }

    public void sundarbans(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",4);
        startActivity(intent);
    }

    public void kuakata(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",5);
        startActivity(intent);
    }

    public void birishiri(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",6);
        startActivity(intent);
    }

    public void varindra(View view){
        Intent intent = new Intent(this,Event.class);
        intent.putExtra("KEY",7);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_popular_places, menu);
        return true;
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
