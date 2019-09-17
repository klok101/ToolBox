package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Switch;

public class thirdActivity extends AppCompatActivity {

    public static final String MY_POK = "pokemon";

    public String myPok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Spinner spinner = findViewById(R.id.spin);

        String[] countries = getResources().getStringArray(R.array.names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout, R.id.text, countries);

        spinner.setAdapter(adapter);

        Intent intent = getIntent();
        myPok = intent.getStringExtra(MY_POK);


    }

    public void shareInfoFinal(View v) {

        Spinner myName = findViewById(R.id.spin);
        Switch mySSwitch = findViewById(R.id.switcheroo);

        String pok = myPok;
        String nam = myName.getSelectedItem().toString();
        String gen = "";

        if (mySSwitch.isChecked()) {

            gen = "Mrs. ";

        } else {

            gen = "Mr. ";

        }

        Intent intent2 = new Intent(this, finalActivity.class);

        intent2.putExtra(finalActivity.MY_POKEMAN, pok);
        intent2.putExtra(finalActivity.MY_NAME, nam);
        intent2.putExtra(finalActivity.MY_GENDER, gen);

        startActivity(intent2);

    }
}
