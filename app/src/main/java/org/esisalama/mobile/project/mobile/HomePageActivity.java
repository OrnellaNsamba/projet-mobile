package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().setTitle("home");
        //creation de la session
        SharedPreferences session = getSharedPreferences("session",0);
        //recuperer un element de la session
        boolean sessionActive = session.getBoolean("session_active",false);
        if(!sessionActive){
            Intent loginIntent = new Intent(this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }
        confgurerButonprofil();
        configurerButonAjout();
        configurerButonListetravail();
    }
    private void configurerButonListetravail(){
        Button listetravail = findViewById(R.id.liste);
        listetravail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(HomePageActivity.this ,listeTravailActivity.class);
                startActivity(listIntent);
            }
        });

    }
    private void configurerButonAjout(){
        Button ajout = findViewById(R.id.ajouter);
        ajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajoutIntent = new Intent(HomePageActivity.this ,ajouterTravailActivity.class);
                startActivity(ajoutIntent);
            }
        });

    }
    private void confgurerButonprofil(){
        Button profil = findViewById(R.id.profil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilIntent = new Intent(HomePageActivity.this ,profilTravailActivity.class);
                startActivity(profilIntent);

            }
        });

    }
}