package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText etNama;
    public Button btnSubmit, btnPindah;
    public TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etNama = findViewById(R.id.et_sample);
        btnSubmit = findViewById(R.id.btn_submit);
        txtNama = findViewById(R.id.text_1);
        btnPindah = findViewById(R.id.btn_pindah);

        //OnClick btnSubmit untuk mengambil data dari edittext kemudian diambiloleh textView
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNama.setText(etNama.getText().toString());
            }
        });
        //OnClick untuk berpindah dari act 1 menuju act 2
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                itn.putExtra("bawa_data", etNama.getText().toString());
                startActivity(itn);
                finish();
            }
        });
    }
}