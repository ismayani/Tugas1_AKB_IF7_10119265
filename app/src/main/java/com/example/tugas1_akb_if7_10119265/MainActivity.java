//20 April 2022, 10119265, Ismayani Setyaningrum, IF7

package com.example.tugas1_akb_if7_10119265;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView sprofile;
    private Button slogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sprofile = findViewById(R.id.btnprofile);
        slogout = findViewById(R.id.btnlogout);

        sprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aksiprofil = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(aksiprofil);
            }
        });

        slogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aksilogout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(aksilogout);
            }
        });

    }
}