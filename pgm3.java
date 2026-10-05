package com.example.basiccalculation;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.n1);
        e2 = (EditText) findViewById(R.id.n2);
        t1 = (TextView) findViewById(R.id.Result);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        return true;
    }

    public void dosum(View v) {
        if (getNumbers()) {
            int sum = n1 + n2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void dosub(View v) {
        if (getNumbers()) {
            int sub = n1 - n2;
            t1.setText(Integer.toString(sub));
        }
    }

    public void doprod(View v) {
        if (getNumbers()) {
            int prod = n1 * n2;
            t1.setText(Integer.toString(prod));
        }
    }

    public void dodiv(View v) {
        if (getNumbers()) {
            int div = n1 / n2;
            t1.setText(Integer.toString(div));
        }
    }
}