package com.example.submissionwisatajatim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvkabupaten;
    private ArrayList<Kabupaten> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvkabupaten = findViewById(R.id.rv_kabupaten);
        rvkabupaten.setHasFixedSize(true);

        list.addAll(DataKabupaten.getlistdata());
        String title = "Kabupaten Kota di Jawa Timur";
        setBar(title);
        show();
    }

    private void show() {
        rvkabupaten.setLayoutManager(new LinearLayoutManager(this));
        rvkabupaten.setAdapter(new KabupatenAdapter(this,list));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.profile){
            Intent profileIntent = new Intent(MainActivity.this,ProfileView.class);
            startActivity(profileIntent);
        }
        return false;
    }
    private void setBar(String title){
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(title);
        }
    }
}
