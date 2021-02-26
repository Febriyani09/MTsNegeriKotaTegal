package com.example.mtsnegerikotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil2);
    }
    public void visimisi(View view) {
        Intent intent=new Intent(ProfilActivity.this, VisiMisiActivity.class);
        startActivity(intent);
    }
    public void sarpras(View view) {
        Intent intent=new Intent(ProfilActivity.this, SarprasActivity.class);
        startActivity(intent);
    }
    public void tentang(View view) {
        Intent intent = new Intent(ProfilActivity.this, TentangActivity.class);
        startActivity(intent);
    }
    public void galeri(View view) {
        Intent intent = new Intent(ProfilActivity.this, GaleriActivity.class);
        startActivity(intent);
    }
}