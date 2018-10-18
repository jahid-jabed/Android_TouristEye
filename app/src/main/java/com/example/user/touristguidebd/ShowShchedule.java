package com.example.user.touristguidebd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ShowShchedule extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_shchedule);
        textView = (TextView)findViewById(R.id.textView_Show_Sched);
        String str = getIntent().getStringExtra("MONTH");
        //Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        if(str.compareTo("January")==0){
            textView.setText("Cox’s Bazar, Ahsan Monjil,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira,\n" +
                    "Sajek valley\n");
        }else if (str.compareTo("February")==0) {
            textView.setText("Cox’s Bazar, Ahsan Monjil,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira,\n" +
                    "Sajek valley\n");
        }else if(str.compareTo("March")==0){
            textView.setText("Cox’s Bazar\n" +
                    "Ahsan Monjil, Foy’s Lake,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("April")==0){
            textView.setText("Cox’s Bazar\n" +
                    "Ahsan Monjil,\n" +
                    "Foy’s Lake,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("May")==0){
            textView.setText("Ahsan Monjil,\n" +
                    "Foy’s Lake,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("June")==0){
            textView.setText("Ahsan Monjil, Foy’s Lake,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("July")==0){
            textView.setText("Ahsan Monjil,\n" +
                    "Foy’s Lake,\n" +
                    "Somapura Mahavira\n" +
                    "\n" +
                    "Footnote: \n" +
                    "Nouka Baich (Boat Rowing) \n");
        }else if(str.compareTo("August")==0){
            textView.setText("Ahsan Monjil, Foy’s Lake,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("September")==0){
            textView.setText("Ahsan Monjil,\n" +
                    "Foy’s Lake,\n" +
                    "Somapura Mahavira\n");
        }else if(str.compareTo("October")==0){
            textView.setText("Cox’s Bazar,\n" +
                    "Ahsan Monjil, Foy’s Lake,\n" +
                    "Patenga Beach,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Somapura Mahavira,\n" +
                    "Sajek valley\n");
        }else if(str.compareTo("November")==0){
            textView.setText("Cox’s Bazar,\n" +
                    "Ahsan Monjil,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira,\n" +
                    "Sajek valley\n");
        }else {
            textView.setText("\n" +
                    "Cox’s Bazar,\n" +
                    "Ahsan Monjil,\n" +
                    "Jaflong,\n" +
                    "Kuakata Sea Beach,\n" +
                    "Patenga Beach,\n" +
                    "Somapura Mahavira,\n" +
                    "Sajek valley\n");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_shchedule, menu);
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
