package com.example.user.touristguidebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void order(View view){
        Intent intent = new Intent(this,Order.class);
        startActivity(intent);
    }

    public void fback(View view){
        Intent intent = new Intent(this,Feedback.class);
        startActivity(intent);
    }

    public void searchPlaces(View view){
        Intent intent = new Intent(this,selectDivision.class);
        startActivity(intent);
    }

    public void emergency(View view){
        Intent intent = new Intent(this,Emergency.class);
        startActivity(intent);
    }

    public void popplace(View v)
    {
        Intent intent = new Intent(this,PopularPlaces.class);
        startActivity(intent);
    }

    public void llanguage(View v)
    {
        Intent intent = new Intent(this,LearnLanguage.class);
        startActivity(intent);
    }

    public void utpal(View v)
    {
        Intent intent = new Intent(this,EventCalender.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
