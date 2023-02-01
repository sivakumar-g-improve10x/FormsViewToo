package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        Toast.makeText(this, email, Toast.LENGTH_SHORT).show();

        EditText userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText("siva Kumar");
        EditText firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText("Guddeti");
        EditText lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText("siva kumar");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {

            String userName = userNameTxt.getText().toString();
            String firstName = firstNameTxt.getText().toString();
            String lastName = lastNameTxt.getText().toString();
            Intent addressIntent = new Intent(this,AddressActivity.class);
            addressIntent.putExtra("email",email);
            addressIntent.putExtra("username",userName);
            addressIntent.putExtra("FirstName",firstName);
            addressIntent.putExtra("LastName",lastName);
            startActivity(addressIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
    }
}