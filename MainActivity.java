package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Cycle","On Pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Cycle","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Cycle","On Resume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("Cycle","On Post Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Cycle"," Destroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Cycle","On Create");
    }

}
