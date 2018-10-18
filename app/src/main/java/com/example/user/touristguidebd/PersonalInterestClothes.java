package com.example.user.touristguidebd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;

public class PersonalInterestClothes extends Activity {

    private static final String[] TEXTS = {"Dhakai Jamdani","Lungi","Khaki Comilla","Shatronji Rangpur","Sopura Silk Rajshahi"};
    private static final int[] IMAGES = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5};
    private static final String[] TEXT = {"3000 tk","500 tk","2500 tk","1500tk","5000 tk"};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
    private TextSwitcher mTextSwitcher1;
    EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_interest_clothes);
        et=(EditText)findViewById(R.id.editText1Z);
        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcherZ);
        mTextSwitcher1=(TextSwitcher) findViewById(R.id.textSwitcher1Z);
        mTextSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterestClothes.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher1.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterestClothes.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mTextSwitcher1.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher1.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcherZ);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(PersonalInterestClothes.this);
                return imageView;
            }
        });
        mImageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        mImageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);

        nxt(null);
    }

    public void nxt(View view) {
        mTextSwitcher1.setText(TEXT[mPosition]);
        mTextSwitcher.setText(TEXTS[mPosition]);
        mImageSwitcher.setBackgroundResource(IMAGES[mPosition]);
        mPosition = (mPosition + 1) % TEXTS.length;
    }

    public void buy(View v) {
        String str = et.getText().toString();
        Intent intent = new Intent(this, Buything.class);
        startActivity(intent);
        Toast.makeText(this,str + "items selected !!", Toast.LENGTH_LONG).show();
    }
}