package com.example.andrew.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectitem(View view) {


        CheckBox right = (CheckBox) findViewById(R.id.answer_question1a);
        boolean check = right.isChecked();
        CheckBox right2 = (CheckBox) findViewById(R.id.answer_question1b);
        boolean checkk = right2.isChecked();
        if (check && checkk) {
            score++;
        }


    }




    public void onRadioButtonClicked(View view) {


        RadioButton right = (RadioButton) findViewById(R.id.answer_question4b);
        boolean check = right.isChecked();
        if (check) {
            score++;
        }

    }

    public void Submit(View view) {
        EditText text = (EditText) findViewById(R.id.answer_question2);
        String value = text.getText().toString();
        String result ="Past Tense";
        if (value.equals(result) ) {
            score++;
        }
        EditText textt = (EditText) findViewById(R.id.answer_question3);
        String value1 = textt.getText().toString();
        String resultt ="Future Tense";
        if (value1.equals(resultt)) {
            score++;
        }
        display(score);
    }

    public void display(int scores) {
        TextView scoree = (TextView) findViewById(R.id.Result);
        scoree.setText(String.valueOf(score));

    }
}
