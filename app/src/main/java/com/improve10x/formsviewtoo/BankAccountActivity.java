package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
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
        Toast.makeText(this, email + "" + userName + " " + firstName + ""+lastName+ "" +hno + "" + street + "" + city + "" + state +""+country+"" + birth + " " + place+""+company+" "+experience+" "+designation, Toast.LENGTH_LONG).show();
        EditText bankTxt = findViewById(R.id.bank_txt);
        bankTxt.setText("apgb Bank");
        String bank = bankTxt.getText().toString();
        EditText accountTxt = findViewById(R.id.account_txt);
        accountTxt.setText("siva kumar");
        String account = accountTxt.getText().toString();
        EditText accountNumberTxt = findViewById(R.id.accountnumber_txt);
        accountNumberTxt.setText("3452554664653");
        String accountNumber = accountNumberTxt.getText().toString();
        EditText ifscTxt = findViewById(R.id.ifsc_txt);
        ifscTxt.setText("5463");
        String ifsc = ifscTxt.getText().toString();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {

            Intent creditIntent = new Intent(this,CreditCardDetailsActivity.class);
            creditIntent.putExtra("email",email);
            creditIntent.putExtra("username",userName);
            creditIntent.putExtra("FirstName",firstName);
            creditIntent.putExtra("LastName",lastName);
            creditIntent.putExtra("Hno",hno);
            creditIntent.putExtra("Street",street);
            creditIntent.putExtra("City",city);
            creditIntent.putExtra("State",state);
            creditIntent.putExtra("Country",country);
            creditIntent.putExtra("Birth",birth);
            creditIntent.putExtra("Place",place);
            creditIntent.putExtra("Company",company);
            creditIntent.putExtra("Experience",experience);
            creditIntent.putExtra("Designation",designation);
            creditIntent.putExtra("BankName",bank);
            creditIntent.putExtra("AccountHolderName",account);
            creditIntent.putExtra("AccountNumber", accountNumber);
            creditIntent.putExtra("IFSC",ifsc);
            startActivity(creditIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}