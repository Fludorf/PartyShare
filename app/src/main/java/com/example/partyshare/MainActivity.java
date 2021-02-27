package com.example.partyshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton button_gallery,button_qrcode, button_hostevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_gallery   = (ImageButton) findViewById(R.id.button_gallery);
        button_qrcode    = (ImageButton) findViewById(R.id.button_qrcode);
        button_hostevent = (ImageButton) findViewById(R.id.button_hostevent);

        button_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        button_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //IMPLEMENT QR FUNCTIONALITY FIRST
            }
        });

        button_hostevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHostActivity();
            }
        });
    }

    private void openHostActivity() {
        Intent intent = new Intent(this, HostActivity.class);
        startActivity(intent);
    }


    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}