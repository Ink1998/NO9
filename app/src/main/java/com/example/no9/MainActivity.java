package com.example.no9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int Random;
    private int GuessTime;
    private boolean ReturnGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        ReturnGame = intent.getBooleanExtra("ReturnGame",true);
        GuessTime = intent.getIntExtra("GuessTime",0);
        Random = intent.getIntExtra("Random",0);

        if (ReturnGame == true){
            Random =  (int)(Math.random()* 9+1);
            intent.putExtra("ReturnGame", false);
        }

        final Button button1 = (Button) findViewById(R.id.Number1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 1);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button2 = (Button) findViewById(R.id.Number2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 2);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button3 = (Button) findViewById(R.id.Number3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 3);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button4 = (Button) findViewById(R.id.Number4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 4);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button5 = (Button) findViewById(R.id.Number5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 5);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button6 = (Button) findViewById(R.id.Number6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 6);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button7 = (Button) findViewById(R.id.Number7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 7);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button8 = (Button) findViewById(R.id.Number8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 8);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button button9 = (Button) findViewById(R.id.Number9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Random", Random);
                intent.putExtra("InputNumber", 9);
                intent.putExtra("GuessTime",GuessTime );
                startActivity(intent);
            }
        });
        final Button R_button = (Button) findViewById(R.id.RestartTheGame);
        R_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random =  (int)(Math.random()* 9+1);
                GuessTime = 0;

            }
        });
    }
}
