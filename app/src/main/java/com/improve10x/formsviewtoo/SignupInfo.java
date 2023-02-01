package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_info);
        EditText emailText = findViewById(R.id.email_txt);
        emailText.setText("sivakumar.g@improve10x.com");
        Button signupButton = findViewById(R.id.signup_btn);
        signupButton.setOnClickListener(view -> {
            String emailAddress = emailText.getText().toString();
            EditText posswordTxt = findViewById(R.id.possword_txt);
            String possword = posswordTxt.getText().toString();
            EditText confirmPosswordTxt = findViewById(R.id.confirmpossword_txt);
            String confirmPossword = confirmPosswordTxt.getText().toString();

            Intent intent = new Intent(this,PersonalInfoActivity.class);
            intent.putExtra("email",emailAddress);
            startActivity(intent);
        });
    }
}