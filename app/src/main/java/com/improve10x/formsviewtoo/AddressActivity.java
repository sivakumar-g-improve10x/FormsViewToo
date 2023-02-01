package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        Toast.makeText(this,email +" " + userName + " " + firstName+" "+ lastName,Toast.LENGTH_LONG).show();
        EditText hnoTxt = findViewById(R.id.hno_txt);
        hnoTxt.setText("04");
        EditText streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText("Ramalayam Streat");
        EditText cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText("Kurnool");
        EditText stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText("Andhra Pradesh");
        EditText countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText("India");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {

            String hno = hnoTxt.getText().toString();
            String street = streetTxt.getText().toString();
            String city = cityTxt.getText().toString();
            String state = stateTxt.getText().toString();
            String country = countryTxt.getText().toString();
            Intent birthIntent = new Intent(this,BirthDetalisActivity.class);
            birthIntent.putExtra("email",email);
            birthIntent.putExtra("username",userName);
            birthIntent.putExtra("FirstName",firstName);
            birthIntent.putExtra("LastName",lastName);
            birthIntent.putExtra("Hno",hno);
            birthIntent.putExtra("Street",street);
            birthIntent.putExtra("City",city);
            birthIntent.putExtra("State",state);
            birthIntent.putExtra("Country",country);
            startActivity(birthIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
                   });
    }
}