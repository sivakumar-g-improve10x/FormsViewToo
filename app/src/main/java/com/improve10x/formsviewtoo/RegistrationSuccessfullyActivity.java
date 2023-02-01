package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationSuccessfullyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successfully);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);

        String username = intent.getStringExtra("username");
        TextView usernameTxt = findViewById(R.id.username_txt);
        usernameTxt.setText(username);

        String firstName = intent.getStringExtra("firstName");
        TextView firstnameTxt = findViewById(R.id.firstname_txt);
        firstnameTxt.setText(firstName);


    }
}