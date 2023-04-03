package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public Button btnBack;
    public TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        String data;
//        txt2 = findViewById(R.id.txt2);
//
//        if (savedInstanceState == null) {
//            Bundle paket = getIntent().getExtras();
//            if (paket == null){
//                data = null;
//            }else{
//                data = paket.getString("bawa_data");
//                txt2.setText(data);
//            }
//        }
//
//
//       btnBack = findViewById(R.id.btn_back);
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent itn = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(itn);
//
//            }
//        });
//

    }
}