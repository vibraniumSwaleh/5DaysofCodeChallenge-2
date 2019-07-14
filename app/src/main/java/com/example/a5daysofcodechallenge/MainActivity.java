package com.example.a5daysofcodechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button about_alc_button, my_profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        about_alc_button = (Button) findViewById(R.id.about_button);
        my_profile_button = (Button) findViewById(R.id.my_profile);

        about_alc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAboutALC4 = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(openAboutALC4);
            }
        });

        my_profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMyProfile = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(openMyProfile);
            }
        });
    }

}
