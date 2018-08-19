package com.example.user.sbmv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class ShowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_show);

        TextView T1 = (TextView)findViewById(R.id.t2f);
        T1.setText(getIntent().getExtras().getString("name1"));

        TextView T2 = (TextView)findViewById(R.id.t4f);
        T2.setText(getIntent().getExtras().getString("name2"));
    }
    public void fn(View v){
        Intent intent = new Intent(getApplicationContext(),ListActivity.class);
        startActivity(intent);
    }
}
