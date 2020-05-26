package com.example.seedcharactergenerator3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGeneratorActivity();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCharactersActivity();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTutorialActivity();
            }
        });

    }

    public void openGeneratorActivity() {
        Intent intent = new Intent(this, generator.class);
        startActivity(intent);
    }

    public void openCharactersActivity() {
        Intent intent2 = new Intent(this, characters.class);
        startActivity(intent2);
    }

    public void openTutorialActivity() {
        Intent intent3 = new Intent (this, tutorial.class);
        startActivity(intent3);
    }
}
