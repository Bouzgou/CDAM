package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Userinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        MainActivity2.UserInfo userInfo = (MainActivity2.UserInfo) getIntent().getSerializableExtra("UserInfo");

        TextView prenomTextView = findViewById(R.id.prenomTextView);
        prenomTextView.setText("Prenom: " + userInfo.getPrenom());
        TextView nomTextView = findViewById(R.id.nomTextView);
        nomTextView.setText("Nom: " + userInfo.getNom());
        TextView emailTextView = findViewById(R.id.emailTextView);
        emailTextView.setText("email: " + userInfo.getEmail());
        TextView passTextView = findViewById(R.id.passTextView);
        passTextView.setText("password: " + userInfo.getPassword());
        TextView phoneTextView = findViewById(R.id.phoneTextView);
        phoneTextView.setText("phone: " + userInfo.getPhoneNumber());
    }
    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}