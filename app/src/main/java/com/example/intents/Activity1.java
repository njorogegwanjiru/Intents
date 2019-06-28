package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }


    public void goTwo(View view) {
        startActivity(new Intent(this, Activity2.class));
    }

    public void goThree(View view) {
        startActivity(new Intent(this, Activity3.class));
    }

    public void goFour(View view) {
        startActivity(new Intent(this, Activity4.class));
    }
}
