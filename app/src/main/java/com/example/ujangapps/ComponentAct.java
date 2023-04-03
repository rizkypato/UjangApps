package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ComponentAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);

        //binding spinner spin menuju spin_hobi di loyout
        Spinner spin = findViewById(R.id.spin_hobi);

        //buat list untuk menyimpan daftar hobi
        List<String> daftar = new ArrayList<String>();
        daftar.add("Rebahan");
        daftar.add("Menganggur");
        daftar.add("Jadi beban");

        //buat Adapter untuk menghubungkan list ke spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, daftar);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String ambil_data = spin.getSelectedItem().toString();
                Toast.makeText(ComponentAct.this, ""+ambil_data, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        RadioGroup radioGroup = findViewById(R.id.radioGender);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
               switch (id){
                   case R.id.radio_laki:
                       Toast.makeText(ComponentAct.this, "Laki-laki", Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.radio_perempuan:
                       Toast.makeText(ComponentAct.this, "Perempuan", Toast.LENGTH_SHORT).show();
                       break;
               }
            }
        });

    }
}