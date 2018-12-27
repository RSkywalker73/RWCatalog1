package com.example.android.rwcatalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        FrameLayout inicio = (FrameLayout) findViewById(R.id.framelayout_inicio);
        //TextView inicio = (TextView) findViewById(R.id.framelayout_inicio);

        // Set a click listener on that View
        inicio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent inicioIntent = new Intent(MainActivity.this, InicioActivity.class);

                // Start the new activity
                startActivity(inicioIntent);
            }
        });

        FrameLayout utensilios = (FrameLayout) findViewById(R.id.framelayout_utensilios);
        //TextView utensilios = (TextView) findViewById(R.id.framelayout_utensilios);

        utensilios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent utensiliosIntent = new Intent(MainActivity.this, UtensiliosActivity.class);

                startActivity(utensiliosIntent);
            }
        });

        FrameLayout complementos = (FrameLayout) findViewById(R.id.framelayout_complementos);
        //TextView complementos = (TextView) findViewById(R.id.framelayout_complementos);

        complementos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent complementosIntent = new Intent(MainActivity.this, ComplementosActivity.class);

                startActivity(complementosIntent);
            }
        });

    }
}
