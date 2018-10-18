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



public class Win extends Activity {

    private static final String[] TEXTS = {"Nokshi Katha","Scraf","Shawl","Pitha","Hoodie"};

    private static final int[] IMAGES = { R.drawable.i1, R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5};
    private static final String[] TEXT = {"3000 tk","300 tk","1500 tk","100 tk per plate","1200 tk"};
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
    private TextSwitcher mTextSwitcher1;
    EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        et=(EditText) findViewById(R.id.editTextW);

        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcherW);
        mTextSwitcher1=(TextSwitcher) findViewById(R.id.textSwitcher1W);
        mTextSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(Win.this);
                textView.setGravity(Gravity.CENTER);
                textView.setTextSize(15f);
                return textView;
            }
        });

        mTextSwitcher1.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(Win.this);
                textView.setGravity(Gravity.CENTER);
                textView.setTextSize(15f);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mTextSwitcher1.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher1.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcherW);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Win.this);
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

            Toast.makeText(this, str + "items selected !!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, Buything.class);
            startActivity(intent);

    }
}