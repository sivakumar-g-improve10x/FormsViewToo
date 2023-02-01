package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
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
        Toast.makeText(this, email + "" + userName + " " + firstName + ""+lastName+ "" +hno + "" + street+""+city+""+state+""+country+"" + birth + " " + place, Toast.LENGTH_SHORT).show();
        EditText companyTxt = findViewById(R.id.company_txt);
        companyTxt.setText("Improve 10x");
        EditText experienceTxt = findViewById(R.id.experience_txt);
        experienceTxt.setText("3 Months");
        EditText designationTxt = findViewById(R.id.desigination_txt);
        designationTxt.setText("Software Developer");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {

           String company = companyTxt.getText().toString();
           String experience = experienceTxt.getText().toString();
           String designation = designationTxt.getText().toString();
            Intent bankIntent = new Intent(this,BankAccountActivity.class);
            bankIntent.putExtra("email",email);
            bankIntent.putExtra("username",userName);
            bankIntent.putExtra("FirstName",firstName);
            bankIntent.putExtra("LastName",lastName);
            bankIntent.putExtra("Hno",hno);
            bankIntent.putExtra("Street",street);
            bankIntent.putExtra("City",city);
            bankIntent.putExtra("State",state);
            bankIntent.putExtra("Country",country);
            bankIntent.putExtra("Birth",birth);
            bankIntent.putExtra("Place",place);
            bankIntent.putExtra("Company",company);
            bankIntent.putExtra("Experience",experience);
            bankIntent.putExtra("Designation",designation);
            startActivity(bankIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}