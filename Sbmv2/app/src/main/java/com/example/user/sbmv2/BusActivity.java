package com.example.user.sbmv2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class BusActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bus);
    }
    public void Clicker1(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
    public void Clicker2(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
    public void Clicker3(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
    public void Clicker4(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
    public void Clicker5(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
    public void Clicker6(View v){
        Intent intent = new Intent(getApplicationContext(),SecondSplashActivity.class);
        startActivity(intent);
    }
}
