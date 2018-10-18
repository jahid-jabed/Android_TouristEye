package com.example.user.touristguidebd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Event extends AppCompatActivity {

    TextView title, description;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        title = (TextView) findViewById(R.id.tv_ev_title);
        description = (TextView) findViewById(R.id.tv_ev_des);
        imageView = (ImageView) findViewById(R.id.imageView);
        int i = getIntent().getIntExtra("KEY",0);
        switch (i){
            case 1: title.setText("Cox's Bazar");
                      description.setText("Cox’s Bazar is a town, a fishing port and district headquarters in Bangladesh. The beach in Cox's Bazar is an unbroken 125 km sandy sea beach with a gentle slope, one of the world's longest. It is located 150 km south of the industrial port Chittagong. Cox's Bazar is also known by the name Panowa, whose literal translation means \"yellow flower.\". Nearest Hotel: Long Beach Hotel. Phn: +8801731508492");
                      imageView.setImageResource(R.drawable.cox);
                break;
            case 2: title.setText("Sajek");
                      description.setText("Sajek is a union at Baghaichari Upazila in Rangamati districts. Basically it is name of a river which separates Bangladesh from India. The river flows into the Karnafuli River in the Chittagong Hill Tracts. Sajek Valley is situated in the North angle of Rangamati, near the Mizoram border boundary area. Most attractions of the spot are sun set, rain, morning, evening, and night and aborigine people. Nearest Resort: Skyview Resort");
                      imageView.setImageResource(R.drawable.sajek);
                break;
            case 3: title.setText("Jaflong");
                      description.setText("Jaflong is a hill station and popular tourist destination in the Division of Sylhet, Bangladesh. It is located in Gowainghat Upazila of Sylhet District and situated at the border between Bangladesh and the Indian state of Meghalaya, overshadowed by subtropical mountains and rainforests. Jaflong is famous for its stone collections and is home of the Khasi tribe.");
                      imageView.setImageResource(R.drawable.jaflong);
                break;
            case 4: title.setText("Sundarbans");
                      description.setText("The Sundarbans  is a natural region comprising southern Bangladesh and a small part in Eastern India. It is the largest single block of tidal halophytic mangrove forest in the world. The Sundarbans covers approximately 10,000 square kilometres (3,900 sq mi) most of which is in Bangladesh with the remainder in India. The Sundarbans is a UNESCO World Heritage Site.");
                      imageView.setImageResource(R.drawable.sundarbans);
                break;
            case 5: title.setText("Kuakata");
                      description.setText("Kuakata Sea Beach is a town known for its panoramic sea beach.[ It is located in south-eastern Bangladesh, and is the number two tourist destination in the country. Kuakata beach is a sandy expanse 18 kilometres (11 mi) long and 3 kilometres (1.9 mi) wide. From the beach one can have an unobstructed view of both sunrise and sunset over the Bay of Bengal.");
                      imageView.setImageResource(R.drawable.kuakata);
                break;

            case 6: title.setText("Birishiri");
                      description.setText("Birishiri Located around 200 km north of the city of Dhaka, close to the border between Bangladesh and India, Birishiri in the Netrokona District is gaining favor with travelers who appreciate natural beauty and enjoy visiting places off the beaten track. With the spectacular Durgapur ceramic hills as a backdrop, the Shomeshwari River is the centerpiece of the area's scenic surroundings.");
                      imageView.setImageResource(R.drawable.birishiri);
                break;

            case 7: title.setText("Varendra Museum");
                      description.setText("Varendra Museum is a museum, research center and popular visitor attraction located at the heart of Rajshahi town and maintained by Rajshahi University in Bangladesh. It is considered the oldest museum in Bangladesh. Varendra museum was the first museum to be established in East Bengal in 1910.");
                      imageView.setImageResource(R.drawable.varendra);
                break;
            case 8: title.setText("Ahsan Monjil");
                description.setText("Ahsan Monjil was the official residential palace and seat of the Dhaka Nawab Family.This magnificent building is situated at Kumartoli along the banks of the Buriganga River in Dhaka, Bangladesh. The construction of this palace was started in 1859 and was completed in 1872. It was constructed in the Indo-Saracenic Revival architecture. It has been designated as a national museum.");
                imageView.setImageResource(R.drawable.ahsanmonjil);
                break;
            case 9:title.setText("Kantaji's Temple");
                description.setText("Kantanagar Temple, commonly known as Kantaji Temple or Kantajew Temple at Kantanagar, is a late-medieval Hindu temple in Dinajpur, Bangladesh. The Kantajew Temple is one of the most magnificent religious edifices belonging to the 18th century. The temple belongs to the popular Hindu Kanta or Krishna and this is most popular with the Radha-Krishna cult (assemble of memorable love) in Bengal. This beautiful temple is dedicated to Krishna and his wife Rukmini. Built by Maharaja Pran Nath, its construction started in 1704 CE and ended in the reign of his son Raja Ramnath 1722 CE,  during the reign of his son Maharaja Ramnath.  It boasts one of the greatest examples on Terracotta architecture in Bangladesh and once had nine spires, but all were destroyed in an earthquake that took place in 1897.");
                imageView.setImageResource(R.drawable.kantajitemple);

            default:
                Toast.makeText(this,"Sorry for the inconvenience.",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event, menu);
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
