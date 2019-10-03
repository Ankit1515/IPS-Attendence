package com.example.ipsattendence;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    public static EditText txtTitle;
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);

        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] list = {"java","c#","c++","pythonn","c","ruby","html","corejava", "advancejava"};
        programmingList.setAdapter(new ProgrammingAdapter(list));

        scan_btn = (Button) findViewById(R.id.btn_scan);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));

            }
        });
    }
}
