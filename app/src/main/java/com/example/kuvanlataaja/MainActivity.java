package com.example.kuvanlataaja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView testikuva;
    Button lataaKuva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testikuva = findViewById(R.id.imageView);
        lataaKuva = findViewById(R.id.button);

        lataaKuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//Painike voisi esim. arpoa kuvan
//Voisiko ladata esim. karttakuvia openstreetmap.org
//arvoKuva();
//Tässä lataa kuva2.png kuvan
                testikuva.setImageResource(R.drawable.hahmo2);

            }
            
        });
    }
}