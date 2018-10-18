package com.example.user.touristguidebd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Buything extends Activity {

    private RadioGroup rg;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buything);
        rg= (RadioGroup) findViewById(R.id.rgsm);
        tv1=(TextView)findViewById(R.id.tv1);

    }

    public void select(View v) {
        int flag=0;
        int checked = rg.getCheckedRadioButtonId();
        switch (checked) {
            case R.id.rdy:
                flag=1;
                break;

            case R.id.rdn:
                flag=0;
                break;

            default:
                break;
        }
        if(flag==1) {
            Intent intent = new Intent(this, Order.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Your Request has been procced!!\nYou will be notified soon",Toast.LENGTH_LONG ).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }





}