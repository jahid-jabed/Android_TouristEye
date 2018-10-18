package com.example.user.touristguidebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EventCalender extends AppCompatActivity {

    TextView tv1;
    Spinner sp1;
    public static String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String months;

    ArrayAdapter <String> adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_calender);
        initialize();

        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,month);
        sp1.setAdapter(adapter1);

        sp1.setOnItemSelectedListener(lisenter);
    }

    AdapterView.OnItemSelectedListener lisenter = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            months = month[position];
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            months = month[0];
        }
    };


    public void initialize()
    {
        tv1 = (TextView) findViewById(R.id.textView);
        sp1 = (Spinner) findViewById(R.id.spinner);

    }

    public void show(View v) {
        Intent intent = new Intent(this,ShowShchedule.class);
        intent.putExtra("MONTH",months);
        //Toast.makeText(this, months, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_calender, menu);
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
