package com.example.user.sbmv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class DataActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_data);
    }
    public void save(View v) {
        EditText e1 = (EditText) findViewById(R.id.bus);
        EditText e2 = (EditText) findViewById(R.id.bus2);

        String BUS = String.valueOf(e1.getText());
        String Area = String.valueOf(e2.getText());

        String Bs1 = "Mohakhali";
        String Bs2 = "Gabtoli";
        String Bs3 = "TT para";
        String Bs4 = "Saidabad";
        String Bs5 = "Kolabagan";

        String Area1 = "Chittagong";
        String Area2 = "Khulna";
        String Area3 = "Rajshahi";
        String Area4 = "Dinajpur";
        String Area5 = "Shylet";
        String Area6 = "Barisal";

        if ( BUS.equals(Bs1) || BUS.equals(Bs2) || BUS.equals(Bs3) || BUS.equals(Bs4) || BUS.equals(Bs5) ) {
            if (Area.equals(Area1) || Area.equals(Area2) || Area.equals(Area3) || Area.equals(Area4) || Area.equals(Area5) || Area.equals(Area6)) {
                Intent inten = new Intent(getApplicationContext(), ShowActivity.class);
                inten.putExtra("name2",e2.getText().toString());
                inten.putExtra("name1",e1.getText().toString());
                startActivity(inten);
                toast();
            } else {
                e2.setText(null);
                toast3();
            }
        }
        else {
            e1.setText(null);
            toast2();
            e2.setText(null);
            toast3();
        }

    }

    public void toast() {
        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
    }
    public void toast2() {
        Toast.makeText(getApplicationContext(), "Invalid bus stand", Toast.LENGTH_SHORT).show();
    }
    public void toast3() {
        Toast.makeText(getApplicationContext(), "Invalid area name", Toast.LENGTH_SHORT).show();
    }

}
