package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        EditText cardNumberTxt = findViewById(R.id.cardnumber_txt);
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
        String bankName = intent.getStringExtra("BankName");
        String accountHolderName = intent.getStringExtra("AccountHolderName");
        String accountNumber = intent.getStringExtra("AccountNumber");
        String ifsc = intent.getStringExtra("IFSC");
        Toast.makeText(this, email+" "+userName+" "+firstName+" "+lastName+" "+hno+" "+street+" "+city+" "+state+" "+country+" "+birth+" "+place+" "+company+" "+experience+" "+designation+" "+bankName+" "+accountHolderName + " " +accountNumber+" "+ifsc, Toast.LENGTH_LONG).show();
        cardNumberTxt.setText("343435366537");
        EditText cardHolderTxt = findViewById(R.id.cardholder_txt);
        cardHolderTxt.setText("Siva Kumar");
        EditText expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText("3-2026");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {

            String cardNumber = cardNumberTxt.getText().toString();
            String cardholder = cardHolderTxt.getText().toString();
            String expiry = expiryTxt.getText().toString();
            Intent identityIntent = new Intent(this,IdentityActivity.class);
            identityIntent.putExtra("email",email);
            identityIntent.putExtra("username",userName);
            identityIntent.putExtra("FirstName",firstName);
            identityIntent.putExtra("LastName",lastName);
            identityIntent.putExtra("Hno",hno);
            identityIntent.putExtra("Street",street);
            identityIntent.putExtra("City",city);
            identityIntent.putExtra("State",state);
            identityIntent.putExtra("Country",country);
            identityIntent.putExtra("Company",company);
            identityIntent.putExtra("Experience",experience);
            identityIntent.putExtra("Designation",designation);
            identityIntent.putExtra("Bank",bankName);
            identityIntent.putExtra("Account Holder Name",accountNumber);
            identityIntent.putExtra("Account Number", accountNumber);
            identityIntent.putExtra("IFSC",ifsc);
            identityIntent.putExtra("Card Number",cardNumber);
            identityIntent.putExtra("cardholder",cardholder);
            identityIntent.putExtra("expiry",expiry);
            startActivity(identityIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}