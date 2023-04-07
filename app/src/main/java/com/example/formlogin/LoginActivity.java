package com.example.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;
    TextView registertxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        registertxt = (TextView) findViewById(R.id.registertxt);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaContent = new Intent(getApplicationContext(), ContentActivity.class);
                startActivity(BukaContent);
            }
        }
        );

        registertxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(BukaRegister);
            }
        });
    }
}