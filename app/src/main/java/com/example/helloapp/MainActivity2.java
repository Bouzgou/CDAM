package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button registerButton = findViewById(R.id.RegistreButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText prenomEditText = findViewById(R.id.prenomInput);
                EditText nomEditText = findViewById(R.id.nom);
                EditText emailEditText = findViewById(R.id.emailInput);
                EditText passwordEditText = findViewById(R.id.passInput);
                EditText phoneNumberEditText = findViewById(R.id.phoneInput);

                String prenom = prenomEditText.getText().toString();
                String nom = nomEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String phoneNumber = phoneNumberEditText.getText().toString();

                if (prenom.isEmpty() || nom.isEmpty() || email.isEmpty() || password.isEmpty() || phoneNumber.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill in all fields.", Toast.LENGTH_SHORT).show();
                } else {
                UserInfo userInfo = new UserInfo(prenom, nom, email, password, phoneNumber);
                Intent intent = new Intent(MainActivity2.this, Userinfo.class);
                intent.putExtra("UserInfo", userInfo);
                startActivity(intent);

                }
            }

        });
    }

    public static class UserInfo implements Serializable {
        private String prenom;
        private String nom;
        private String email;
        private String password;
        private String phoneNumber;

        public UserInfo(String prenom, String nom, String email, String password, String phoneNumber) {
            this.prenom = prenom;
            this.nom = nom;
            this.email = email;
            this.password = password;
            this.phoneNumber = phoneNumber;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getNom() {
            return nom;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

    }
}
