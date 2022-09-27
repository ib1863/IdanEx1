package com.example.idanex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    EditText et;
    double sum;
    int peula;
    boolean torF;
    double toSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        et = (EditText) findViewById(R.id.editTextNumberDecimal);
        sum = 0;
        peula = 0;
        toSend = 0;
    }


    public static boolean isNumeric(String toCheck)
    {
        try{ //checking if in the command below theres a problem, like turning a / or .. to double number
            Double.parseDouble(toCheck);
            return true;
        } catch (NumberFormatException e) { // if the try found a problem he will come to here and return false
            return false;
        }
    }

    public static double mathematicProblems(double num1, double num2, int toDo) {
        switch (toDo) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                return 0;
        }
    }


    public void Credits(View view) {
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("lastAnswer", toSend);
        startActivity(si);

    }



    public void Plus(View view) {
        String input  = et.getText().toString();
        torF = isNumeric(input);
        if(torF == false)
        {
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            return;
        }
        sum = mathematicProblems(sum, Double.parseDouble(input), peula);
        if(sum == 0)
        {
            sum = Double.parseDouble(input);
        }
        et.setText("");
        et.setHint(String.valueOf(sum) + "+");
        peula = 1;



    }

    public void Equal(View view) {
        String input  = et.getText().toString();
        torF = isNumeric(input);
        if(torF == false)
        {
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            return;
        }
        sum = mathematicProblems(sum, Double.parseDouble(input), peula);
        if(sum == 0)
        {
            sum = toSend;
        }
        et.setText(String.valueOf(sum));
        peula = 0;
        toSend = sum;
    }



    public void Minus(View view) {
        String input  = et.getText().toString();
        torF = isNumeric(input);
        if(torF == false)
        {
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            return;
        }
        sum = mathematicProblems(sum, Double.parseDouble(input), peula);
        if(sum == 0)
        {
            sum = Double.parseDouble(input);
        }
        et.setText("");
        et.setHint(String.valueOf(sum) + "-");
        peula = 2;
    }

    public void Kefel(View view) {
        String input  = et.getText().toString();
        torF = isNumeric(input);
        if(torF == false)
        {
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            return;
        }
        sum = mathematicProblems(sum, Double.parseDouble(input), peula);
        if(sum == 0)
        {
            sum = Double.parseDouble(input);
        }
        et.setText("");
        et.setHint(String.valueOf(sum) + "*");
        peula = 3;
    }

    public void Hilok(View view) {
        String input  = et.getText().toString();
        torF = isNumeric(input);
        if(torF == false)
        {
            Toast.makeText(this, "Wrong Input!", Toast.LENGTH_SHORT).show();
            return;
        }
        sum = mathematicProblems(sum, Double.parseDouble(input), peula);
        if(sum == 0)
        {
            sum = Double.parseDouble(input);
        }
        et.setText("");
        et.setHint(String.valueOf(sum) + "/");
        peula = 4;
    }

    public void Clear(View view) {
        et.setText("");
        sum = 0;
        peula = 0;
        et.setHint("0");
    }


}