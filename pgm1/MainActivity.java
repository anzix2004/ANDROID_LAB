package com.example.my_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText Username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.email_id);
        password = findViewById(R.id.password);

        Button LOGIN = findViewById(R.id.button_Submit);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Objects.equals(Username.getText().toString(), "admin@gmail.com") &&
                        Objects.equals(password.getText().toString(), "pass123")) {

                    Toast.makeText(MainActivity.this,
                            "Authentication Successfully",
                            Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(MainActivity.this,
                            "Failed",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}