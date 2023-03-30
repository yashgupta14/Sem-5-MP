package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mcontinue_button;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcontinue_button = findViewById(R.id.continue_button);

        mcontinue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Questions.class));
            }
        });

        radioGroup= findViewById(R.id.radiogroup);
        textView=findViewById(R.id.text_selected);

        Button buttonApply= findViewById(R.id.apply_button);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();

                radioButton=findViewById(radioId);
                textView.setText("Your choice: " + radioButton.getText());
            }
        });
    }
    public void checkbutton(View v){
        int radioId=radioGroup.getCheckedRadioButtonId();

        radioButton=findViewById(radioId);

        Toast.makeText(this, "Selected Subject: " + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }
}