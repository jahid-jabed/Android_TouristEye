package com.example.user.touristguidebd;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Locale;
public class LearnLanguage extends AppCompatActivity  implements View.OnClickListener {

    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_language);
        tts = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(Locale.US);
                /*if(status != tts.ERROR){
                    tts.setLanguage(Locale.US);
                    //tts.setSpeechRate((float).9);
                }*/
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learn_language, menu);
        return true;
    }

    @Override
    protected void onPause() {
        if (tts != null) {
            tts.stop();
        }
        super.onPause();
    }
    @SuppressWarnings("deprecation")
    private void ttsUnder20(String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "MessageId");
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, map);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void ttsGreater21(String text) {
        String utteranceId=this.hashCode() + "";
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button_tts1:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Khaoa");
            } else {
                ttsUnder20("Khaoa");
            }
                break;
            case R.id.button_tts2:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Khabar");
            } else {
                ttsUnder20("Khabar");
            }
                break;
            case R.id.button_tts3:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("taka");
            } else {
                ttsUnder20("taka");
            }
                break;
            case R.id.button_tts4:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("murgi");
            } else {
                ttsUnder20("murgi");
            }
                break;
            case R.id.button_tts5:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Mach");
            } else {
                ttsUnder20("Mach");
            }
                break;
            case R.id.button_tts6:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Ful");
            } else {
                ttsUnder20("Ful");
            }
                break;
            case R.id.button_tts7:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Rickshawala");
            } else {
                ttsUnder20("Rickshawala");
            }
                break;
            case R.id.button_tts8:if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                ttsGreater21("Shobgi");
            } else {
                ttsUnder20("Shobgi");
            }
                break;
            default:
                Toast.makeText(this,"Sorry for this inconvenience.",Toast.LENGTH_SHORT).show();
        }

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
