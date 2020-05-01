package com.apps.panirayadi.tugassharedpreference;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.panirayadi.R;
import com.apps.panirayadi.tugassharedpreferences.utils.Preferences;

/*
Tgl  : 30 april 2020
desc : membuat tampilan home
nim  : 10117144
nama : Muhamad Pani Rayadi
kelas: IF4
 */

public class home extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Preferences.setLogout(getBaseContext());


                startActivity(new Intent(getBaseContext(), login.class));
                finish();
            }
        });
    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
