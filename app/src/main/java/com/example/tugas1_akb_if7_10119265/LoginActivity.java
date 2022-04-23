//20 April 2022, 10119265, Ismayani Setyaningrum, IF7

package com.example.tugas1_akb_if7_10119265;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private Button slogin,sregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        slogin = findViewById(R.id.btnlogin);
        sregister = findViewById(R.id.btnregister);

        slogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent aksilogin = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(aksilogin);
        }
        });

        sregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aksiregister = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(aksiregister);
            }
        });
    }
}