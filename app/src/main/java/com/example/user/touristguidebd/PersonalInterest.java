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



public class PersonalInterest extends Activity {

    private static final String[] TEXTS = { "Rajshahi Mango", "Dinajpur Lichi", "Comilla Rosomalai","Bogra Doi","Dry fish Chittagong","Kachagolla Natore","Hilsha Chadpur","Bakhorkhani Dhaka" };
    private static final int[] IMAGES = { R.drawable.mf1, R.drawable.mf2,R.drawable.mf3,R.drawable.mf4,R.drawable.mf6,R.drawable.mf7, R.drawable.mf8,R.drawable.mf9};
    private static final String[] TEXT = {"40 TK per kg","2 TK per pc","300 tk per kg","200 tk per kg","2000 tk per kg","200 tk per kg","300 tk per pc","10 tk per pc" };
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
    private TextSwitcher mTextSwitcher1;
    EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_interest);
        et=(EditText) findViewById(R.id.editText1);
        //String str = et.getText().toString();
        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        mTextSwitcher1=(TextSwitcher) findViewById(R.id.textSwitcher1);
        mTextSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterest.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher1.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(PersonalInterest.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mTextSwitcher1.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher1.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(PersonalInterest.this);
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
        Toast.makeText(this,str + "items selected !!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Buything.class);
        startActivity(intent);
    }
}