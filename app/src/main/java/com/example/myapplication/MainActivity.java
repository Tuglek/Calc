package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private Button btn;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editA = findViewById(R.id.editTextA);
        editB = findViewById(R.id.editTextB);
        editC = findViewById(R.id.editTextC);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSolve();
            }
        });
    }
    public void doSolve() {
        String str_a = editA.getText().toString(); // "3"
        String str_b = editB.getText().toString();
        String str_c = editC.getText().toString();
        Double a = Double.parseDouble(str_a); // 3
        Double b = Double.parseDouble(str_b);
        Double c = Double.parseDouble(str_c);
        Double d = b*b - 4*a*c;
        if (a != 0 && b != 0 && c!=0) {
            if (d == 0) {
                double x = -b / (2 * a);
                tv.setText(String.format("x = %.2f", x));
            } else if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 2 * a;
                tv.setText(String.format("x1 = %.2f, x2 = %.2f", x1, x2));
            } else {
                tv.setText("not solve!");
            }

        }
    }
}