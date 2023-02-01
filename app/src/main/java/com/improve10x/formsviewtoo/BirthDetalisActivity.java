package com.improve10x.formsviewtoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetalisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_detalis);
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
        Toast.makeText(this, email + "" + userName + " " + firstName + ""+lastName+ "" +hno + "" + street+""+city+""+state+""+country, Toast.LENGTH_LONG).show();
        EditText birthTxt = findViewById(R.id.birth_txt);
        birthTxt.setText("0-2-1995");
        EditText placeTxt = findViewById(R.id.place_txt);
        placeTxt.setText("Sree Rangapuram");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            String birth = birthTxt.getText().toString();
            String place = placeTxt.getText().toString();
            Intent professionalIntent = new Intent(this,ProfessionalInfoActivity.class);
            professionalIntent.putExtra("email",email);
            professionalIntent.putExtra("username",userName);
            professionalIntent.putExtra("FirstName",firstName);
            professionalIntent.putExtra("LastName",lastName);
            professionalIntent.putExtra("Hno",hno);
            professionalIntent.putExtra("Street",street);
            professionalIntent.putExtra("City",city);
            professionalIntent.putExtra("State",state);
            professionalIntent.putExtra("Country",country);
            professionalIntent.putExtra("Birth",birth);
            professionalIntent.putExtra("Place",place);
            startActivity(professionalIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}