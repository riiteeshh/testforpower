package com.example.testforpower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView test;

    

    @Override
    // for blocking the system dialogs
    // only if statement and checking the the screen off or on  is remaining
    public void onWindowFocusChanged(boolean focus) {
        super.onWindowFocusChanged(focus);

        if (! focus) {
            Intent close= new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
            sendBroadcast(close);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
}}

