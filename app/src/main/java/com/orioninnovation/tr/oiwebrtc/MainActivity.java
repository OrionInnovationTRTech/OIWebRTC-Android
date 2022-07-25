package com.orioninnovation.tr.oiwebrtc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orioninnovation.tr.oiwebrtc.rtc.PCObserver;

public class MainActivity extends AppCompatActivity {

    //TODO: We should have a sample app in here.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dummy Observer to see Library compile is successful
        PCObserver pcObserver = new PCObserver();
    }
}