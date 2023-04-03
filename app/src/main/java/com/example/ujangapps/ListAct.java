package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;

public class ListAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] kegiatan = new String[]{"Belanja", "Olahraga", "Belajar",
        "Rapat", "Tidur", "Main", "Ibadah"};

        ListView listkegiatan = findViewById(R.id.list_kegiatan);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kegiatan);
        listkegiatan.setAdapter(adapter);

        listkegiatan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ListAct.this, "10" + position +
                        "\n Nama Kegiatan : " + kegiatan[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}