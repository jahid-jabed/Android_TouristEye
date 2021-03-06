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



public class Summer extends Activity {

    private static final String[] TEXTS = { "Fotua", "Cap", "Sunglass","Umbrella","Sandal","Hawai Shirt"};
    private static final int[] IMAGES = {R.drawable.fotua, R.drawable.cap,R.drawable.sg, R.drawable.um,R.drawable.san,R.drawable.hawai};
    private static final String[] TEXT = {"1000 tk","200 tk","300 tk","250 tk","500 tk","850 tk" };
    private int mPosition = 0;
    private TextSwitcher mTextSwitcher;
    private ImageSwitcher mImageSwitcher;
    private TextSwitcher mTextSwitcher1;
    EditText et;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);
        et=(EditText) findViewById(R.id.editTextS);
        //String str = et.getText().toString();
        mTextSwitcher = (TextSwitcher) findViewById(R.id.textSwitcherS);
        mTextSwitcher1=(TextSwitcher) findViewById(R.id.textSwitcher1S);
        mTextSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(Summer.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher1.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(Summer.this);
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        mTextSwitcher.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher.setOutAnimation(this, android.R.anim.fade_out);

        mTextSwitcher1.setInAnimation(this, android.R.anim.fade_in);
        mTextSwitcher1.setOutAnimation(this, android.R.anim.fade_out);

        mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcherS);
        mImageSwitcher.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Summer.this);
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