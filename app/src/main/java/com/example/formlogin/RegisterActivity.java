package com.example.formlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView loginTxt;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginTxt = (TextView) findViewById(R.id.loginTxt);
        registerBtn = (Button) findViewById(R.id.registerbtn);

        loginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(BukaLogin);
            }
        } );

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(Login);
            }
        });
    }
}