package com.example.random25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // math
        // lam tron
//        Double value1 = Math.ceil(a);
        // lam tron xuong
        double value2 = Math.floor(a);
        Log.d("BBB",String.valueOf(value2));
    }
}
