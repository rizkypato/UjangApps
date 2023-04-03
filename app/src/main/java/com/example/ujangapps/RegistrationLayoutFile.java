package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegistrationLayoutFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_layout_file);
    }

    public void pencet(View view) {
        String label = ((Button)view).getText().toString();
        Log.i("Status", label + "Telah ditekan");

    }
}