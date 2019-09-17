package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    public static final String MY_GEN = "generation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String myGen = intent.getStringExtra(MY_GEN);

        String strToDisplay = "Which starting " + myGen + " pokemon do you want to choose?";
        TextView str = findViewById(R.id.info);
        str.setText(strToDisplay);

        if (myGen.equalsIgnoreCase("Generation 1")) {

            RadioButton rd1 = findViewById(R.id.RBchoice1);
            RadioButton rd2 = findViewById(R.id.RBchoice2);
            RadioButton rd3 = findViewById(R.id.RBchoice3);

            rd1.setText("Bulbasaur");
            rd2.setText("Squirtle");
            rd3.setText("Charmander");

        } else if (myGen.equalsIgnoreCase("Generation 2")) {

            RadioButton rd1 = findViewById(R.id.RBchoice1);
            RadioButton rd2 = findViewById(R.id.RBchoice2);
            RadioButton rd3 = findViewById(R.id.RBchoice3);

            rd1.setText("Chikorita");
            rd2.setText("Cyndaquil");
            rd3.setText("Totodile");

            ImageView iv = findViewById(R.id.generationiv);
            iv.setImageResource(R.drawable.gen2starterpics);

        } else {

            RadioButton rd1 = findViewById(R.id.RBchoice1);
            RadioButton rd2 = findViewById(R.id.RBchoice2);
            RadioButton rd3 = findViewById(R.id.RBchoice3);

            rd1.setText("Treecko");
            rd2.setText("Torchic");
            rd3.setText("Mudkip");

            ImageView iv = findViewById(R.id.generationiv);
            iv.setImageResource(R.drawable.gen3starterpics);

        }
    }

    public void shareInfo(View v) {

        RadioButton mypok1 = findViewById(R.id.RBchoice1);
        RadioButton mypok2 = findViewById(R.id.RBchoice2);
        RadioButton mypok3 = findViewById(R.id.RBchoice3);

        String mypok = "";

        if (mypok1.isChecked()) {

            mypok = mypok1.getText().toString();

        } else if (mypok2.isChecked()) {

            mypok = mypok2.getText().toString();

        } else if (mypok3.isChecked()) {

            mypok = mypok3.getText().toString();

        }

        if (mypok.equals("")) {

            Toast.makeText(getApplicationContext(), "Please choose a Pokemon", Toast.LENGTH_SHORT).show();

        } else {

            Intent intent = new Intent(this, thirdActivity.class);

            intent.putExtra(thirdActivity.MY_POK, mypok);

            startActivity(intent);

        }

    }
}
