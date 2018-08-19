package com.example.user.sbmv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ConfirmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_confirm);
    }

    public void cnn(View v){
        Intent intent = new Intent(getApplicationContext(),FinalActivity.class);
        startActivity(intent);
    }
    public void cnl(View v){
        Intent intent = new Intent(getApplicationContext(),ThankActivity.class);
        startActivity(intent);
    }
}
