package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("LastName");
        String hno = intent.getStringExtra("Hno");
        String street = intent.getStringExtra("Street");
        String city = intent.getStringExtra("City");
        String state = intent.getStringExtra("State");
        String country = intent.getStringExtra("Country");
        String birth = intent.getStringExtra("Birth");
        String place = intent.getStringExtra("Place");
        String company = intent.getStringExtra("Company");
        String experience = intent.getStringExtra("Experience");
        String designation = intent.getStringExtra("Designation");
        String bankName = intent.getStringExtra("Bank Name");
        String accountHolderName = intent.getStringExtra("Account Holder Name");
        String accountNumber = intent.getStringExtra("Account Number");
        String ifsc = intent.getStringExtra("IFSC");
        String cardNumber = intent.getStringExtra("CardNumber");
        String cardHolderName = intent.getStringExtra("CardHolderName");
        String expiry = intent.getStringExtra("expiry");
        Toast.makeText(this, email + "" + userName + "" + firstName + "" + lastName + "" + hno + "" + street + "" + city + "" + state + "" + country + "" + birth + "" + place + "" + company + "" + experience + "" + designation + "" + bankName + "" + accountHolderName + "" + accountNumber + "" + ifsc + "" + cardNumber + "" + cardHolderName + "" + expiry, Toast.LENGTH_SHORT).show();
       Button nextBtn = findViewById(R.id.next_btn);
       nextBtn.setOnClickListener(v -> {
          Intent successfulIntent = new Intent(this,RegistrationSuccessfullyActivity.class);
          successfulIntent.putExtra("email",email);
           successfulIntent.putExtra("username",userName);
           successfulIntent.putExtra("FirstName",firstName);
           successfulIntent.putExtra("LastName",lastName);
           successfulIntent.putExtra("Hno",hno);
           successfulIntent.putExtra("Street",street);
           successfulIntent.putExtra("City",city);
           successfulIntent.putExtra("State",state);
           successfulIntent.putExtra("Country",country);
           successfulIntent.putExtra("Company",company);
           successfulIntent.putExtra("Experience",experience);
           successfulIntent.putExtra("Designation",designation);
           successfulIntent.putExtra("Bank",bankName);
           successfulIntent.putExtra("Account Holder Name",accountNumber);
           successfulIntent.putExtra("Account Number", accountNumber);
           successfulIntent.putExtra("IFSC",ifsc);
           successfulIntent.putExtra("CardNumber",cardNumber);
           successfulIntent.putExtra("CardHolder",cardHolderName);
           successfulIntent.putExtra("expiry",expiry);
           startActivity(successfulIntent);
       });
        EditText panNumberTxt = findViewById(R.id.pannumber_txt);
        panNumberTxt.setText("4366288493fh");
        EditText aadharNumberTxt = findViewById(R.id.aadharnumber_txt);
        aadharNumberTxt.setText("4537384859363");

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
         finish();
        });
    }
}