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

public class PersonalInterestHandicraft extends Activity {

    private static final String[] TEXTS = {"Handmade Toys","HandCrafted Bag","Bamboo Lamp","Jute Made Craft","Jwellary Handicraft"};
    private static final int[] IMAGES = {R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4,R.drawable.h5};
    private static final String[] TEXT = {"200 tk","800 tk","1200 tk","1500tk","700 tk"};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
    private TextSwitcher mTextSwitcher1;

    EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_interest_handicraft);
        et=(EditText)findViewById(R.id.editText1ZZ);
        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcherZZ);
        mTextSwitcher1=(TextSwitcher) findViewById(R.id.textSwitcher1ZZ);
        mTextSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterestHandicraft.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher1.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterestHandicraft.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mTextSwitcher1.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher1.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcherZZ);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(PersonalInterestHandicraft.this);
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