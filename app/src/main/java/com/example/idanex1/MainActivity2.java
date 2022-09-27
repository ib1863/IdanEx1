package com.example.idanex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton$InspectionCompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button8);
        tv = findViewById(R.id.textView);
        Intent gi = getIntent();
        double result = gi.getDoubleExtra("lastAnswer", 10203992310.0);
        String finalresult = new Double(result).toString();
        tv.setText(finalresult);
    }
    ;


    public void btn1(View view) {
        Intent si = new Intent(this,MainActivity.class);
        startActivity(si);

    }
}