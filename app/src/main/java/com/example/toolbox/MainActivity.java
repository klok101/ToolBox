package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareInfo1(View v){

        CheckBox myGen = (CheckBox) findViewById(R.id.CBgen1);

        String myGenStr = myGen.getText().toString();

        Intent intent = new Intent(this,secondActivity.class);

        myGen.setChecked(false);

        intent.putExtra(secondActivity.MY_GEN, myGenStr);

        startActivity(intent);

    }

    public void shareInfo2(View v){

        CheckBox myGen = (CheckBox) findViewById(R.id.CBgen2);

        String myGenStr = myGen.getText().toString();

        Intent intent = new Intent(this,secondActivity.class);

        myGen.setChecked(false);

        intent.putExtra(secondActivity.MY_GEN, myGenStr);

        startActivity(intent);



    }

    public void shareInfo3(View v){

        CheckBox myGen = (CheckBox) findViewById(R.id.CBgen3);

        String myGenStr = myGen.getText().toString();

        Intent intent = new Intent(this,secondActivity.class);

        myGen.setChecked(false);

        intent.putExtra(secondActivity.MY_GEN, myGenStr);

        startActivity(intent);

    }
}
