package com.example.user.sbmv2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        try {
            setContentView(R.layout.activity_list);
            ListView l1 = (ListView) findViewById(R.id.listView);
            String [] schedule = {

                    "4:30 am",
                    "5:00 am",
                    "5:30 am",
                    "6:00 am",
                    "6:30 am",
                    "7:00 am",
                    "7:30 am",
                    "8:00 am",
                    "8:30 am",
                    "9:00 am",
                    "9:30 am",
                    "10:00 am",
                    "10:30 am",
                    "11:00 am",
                    "11:30 am",
                    "12:00 pm",
                    "12:30 pm",
                    "1:00 pm",
                    "1:30 pm",
                    "2:00 pm",
                    "3:00 pm",
                    "3:30 pm",
                    "4:00 pm",
                    "4:30 pm",
                    "5:00 pm",
                    "5:30 pm",
                    "6:00 pm",
                    "6:30 pm",
                    "7:00 pm",
                    "7:30 pm",
                    "8:00 pm",
                    "8:30 pm",
                    "9:00 pm",
                    "9:30 pm",
                    "10:00 pm",
                    "10:30 pm",
                    "11:00 pm",
                    "11:30 pm",
                    "12:00 am",
                    "12:30 am",
                    "1:00 am",
                    "1:30 am",
                    "2:00 am",
                    "3:00 am",
                    "3:30 am",
                    "4:00 am",

            };
            ListAdapter la = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, schedule);
            l1.setAdapter(la);
            l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    int pos = position;

                    for (int i = 0; i < 48; i++) {
                        if (pos == i) {
                            Intent in = new Intent(getApplicationContext(), ConfirmActivity.class);
                            startActivity(in);
                            break;
                        }
                    }
                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
