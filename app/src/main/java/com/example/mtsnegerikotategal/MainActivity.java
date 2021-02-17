package com.example.mtsnegerikotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void program(View view){
        Intent intent=new Intent(MainActivity.this, ProgramActivity.class);
        startActivity(intent);
    }
    public void gurudanstaf(View view){
        Intent intent=new Intent(MainActivity.this, GurudanStafActivity.class);
        startActivity(intent);
    }
    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }
    public void sejarah(View view){
        Intent intent=new Intent(MainActivity.this, SejarahActivity.class);
        startActivity(intent);
    }
    public void kontak(View view){
        Intent intent=new Intent(MainActivity.this, KontakActivity.class);
        startActivity(intent);
    }
}