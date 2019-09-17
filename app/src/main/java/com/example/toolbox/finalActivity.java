package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class finalActivity extends AppCompatActivity {

    public static final String MY_POKEMAN = "pokemon";
    public static final String MY_NAME = "name";
    public static final String MY_GENDER = "gender";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();

        String myPokemon = intent.getStringExtra(MY_POKEMAN);
        String myName = intent.getStringExtra(MY_NAME);
        String myGender = intent.getStringExtra(MY_GENDER);

        TextView tvN = findViewById(R.id.textViewName);
        TextView tvP = findViewById(R.id.textViewPok);

        tvN.setText(myGender + myName);
        tvP.setText(myPokemon);

        ImageView iv = findViewById(R.id.imview);

        if (myPokemon.equalsIgnoreCase("charmander")) {

            iv.setImageResource(R.drawable.charmander);

        } else if (myPokemon.equalsIgnoreCase("charmander")) {

            iv.setImageResource(R.drawable.charmander);

        } else if (myPokemon.equalsIgnoreCase("bulbasaur")) {

            iv.setImageResource(R.drawable.bulbasaur);

        } else if (myPokemon.equalsIgnoreCase("chikorita")) {

            iv.setImageResource(R.drawable.chikorita);

        } else if (myPokemon.equalsIgnoreCase("cyndaquil")) {

            iv.setImageResource(R.drawable.cyndaquil);

        } else if (myPokemon.equalsIgnoreCase("mudkip")) {

            iv.setImageResource(R.drawable.mudkip);

        } else if (myPokemon.equalsIgnoreCase("squirtle")) {

            iv.setImageResource(R.drawable.squirtle);

        } else if (myPokemon.equalsIgnoreCase("torchic")) {

            iv.setImageResource(R.drawable.torchic);

        } else if (myPokemon.equalsIgnoreCase("totodile")) {

            iv.setImageResource(R.drawable.totodile);

        } else {

            iv.setImageResource(R.drawable.treecko);

        }

    }

    public void goBack(View v) {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
}
