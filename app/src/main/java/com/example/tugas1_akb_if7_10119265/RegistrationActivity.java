//20 April 2022, 10119265, Ismayani Setyaningrum, IF7

package com.example.tugas1_akb_if7_10119265;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class RegistrationActivity extends AppCompatActivity {
    private Button sregister2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);
        sregister2 = findViewById(R.id.btnregister2);
        sregister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aksiregister2 = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(aksiregister2);
            }
        });
    }
}