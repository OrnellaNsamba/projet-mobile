package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ajouterTravailActivity extends AppCompatActivity {
    private EditText editTextDescription;
    private EditText editTextPromotion;
    private EditText editTextCategory;
    private EditText editTextDateTravail;
    private Button buttonAjouterPhoto;
    private Button buttonAjouterTravail;
    private EditText editTextViewNomsPhotos;
    private ProgressBar progressBar;
    private Button buttonvalide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutertravail);
        initialiserComposant();
        Button button = findViewById(R.id.editTexajouTrav);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editTextCategory.getText().toString().isEmpty()) {
                            Toast.makeText(
                                    ajouterTravailActivity.this,
                                    "Le matricule ne doit pas etre vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        } else if (editTextDateTravail.getText().toString().isEmpty()) {
                            Toast.makeText(
                                    ajouterTravailActivity.this,
                                    "Le mot de passe ne doit pas etre vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        }else if (editTextDescription.getText().toString().isEmpty()) {
                            Toast.makeText(
                                    ajouterTravailActivity.this,
                                    "champ vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        }else if (editTextPromotion.getText().toString().isEmpty()) {
                            Toast.makeText(
                                    ajouterTravailActivity.this,
                                    "champ vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        }else if (editTextViewNomsPhotos.getText().toString().isEmpty()) {
                            Toast.makeText(
                                    ajouterTravailActivity.this,
                                    "champ vide",
                                    Toast.LENGTH_LONG
                            ).show();
                        }else{
                            Intent valide = new Intent(ajouterTravailActivity.this, HomePageActivity.class);
                            startActivity(valide);
                        }



                    }

                });
    }

    private void initialiserComposant() {
        editTextDescription = findViewById(R.id.editTexDesc);
        editTextPromotion = findViewById(R.id.edittextprom);
        editTextCategory = findViewById(R.id.edittextcat);
        editTextDateTravail = findViewById(R.id.editTEXtDate);
        buttonAjouterPhoto = findViewById(R.id.editTestajouPhoto);
        buttonAjouterTravail = findViewById(R.id.editTexajouTrav);
        editTextViewNomsPhotos = findViewById(R.id.editnomphot);
        progressBar = findViewById(R.id.progressBar);
    }

}
