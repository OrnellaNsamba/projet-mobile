package org.esisalama.mobile.project.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class modifieprofilActivity extends AppCompatActivity {

    private EditText editTextancien;
    private EditText editTextnouveau;
    private EditText editTextConfirmeNouveau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifieprofil);

        Button button = findViewById(R.id.submit);
        editTextConfirmeNouveau = findViewById(R.id.conf_nouveau);
        editTextnouveau = findViewById(R.id.nouveau);
        editTextancien = findViewById(R.id.acien);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String confnouveau = editTextConfirmeNouveau.getText().toString();
                String nouveau = editTextnouveau.getText().toString();
                String ancien = editTextancien.getText().toString();
                if (!ancien.equals("19nk445")) {
                    Toast.makeText(modifieprofilActivity.this, "entrez l'ancien mot de passe!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (nouveau.length() < 6) {
                    Toast.makeText(modifieprofilActivity.this, "au moin 6 caractere ou vide", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (confnouveau.isEmpty() || !confnouveau.equals(nouveau)) {
                    Toast.makeText(modifieprofilActivity.this, "comfirme l'ancien mot de passe ou l'encient different du nouveau", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(modifieprofilActivity.this,HomePageActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}