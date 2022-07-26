package org.esisalama.mobile.project.mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class profilTravailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiltravail);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.menu_modifier_profil) {
            Toast.makeText(this, "clique profil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(profilTravailActivity.this,modifieprofilActivity.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.menu_parametre){
            Toast.makeText(this, "Clique parametre", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    //pour ratache a un menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profil,menu);
        return super.onCreateOptionsMenu(menu);
    }

}