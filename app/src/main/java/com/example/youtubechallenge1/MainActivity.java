package com.example.youtubechallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View view) {
        TextView firstNameTextView = findViewById(R.id.textViewFirstName);
        TextView lastNameTextView = findViewById(R.id.textViewLastName);
        TextView emailTextView = findViewById(R.id.textViewEmail);

        EditText firstNameEditText = findViewById(R.id.editTextFirstName);
        EditText lastNameEditText = findViewById(R.id.editTextLastName);
        EditText emailEditText = findViewById(R.id.editTextEmailAddress);

        firstNameTextView.setText(firstNameEditText.getText().toString());
        lastNameTextView.setText(lastNameEditText.getText().toString());
        emailTextView.setText(emailEditText.getText().toString());
    }
}