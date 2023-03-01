package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListVeiw = findViewById(R.id.activity_listView);
        String[] items = new String[]{"ActivityCheckbox", "ActivityDatePicker", "ActivityDatePickerDialog",
                "ActivityProgressBar", "ActivityRadioButton", "ActivityRating", "ActivityRunnableThreadHandler", "ActivityScrollView",
                "ActivitySpinner", "ActivitySwitch", "ActivityTimePicker", "MainActivity", "MainButton", "MainCalendarView", "MainDialog",
                "MainEditText", "MainImageView", "MainLinearLayout", "MainRelativeLayout", "MainSeekBar", "MainTable", "MainTextView", "MainToast"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        myListVeiw.setAdapter(adapter);
        myListVeiw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = null;
                try {
                    myIntent = new Intent(MainActivity.this, Class.forName("com.example.myapplication."+adapterView.getItemAtPosition(i).toString()));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                startActivity(myIntent);
            }
        });
    }
}