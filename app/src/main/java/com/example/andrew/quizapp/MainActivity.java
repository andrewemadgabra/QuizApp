package com.example.andrew.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        CheckBox checkA = (CheckBox) findViewById(R.id.answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.answer_question1b);
        if (checkA.isChecked() && checkB.isChecked()) {
            score += 1;
        } else {
            return;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton right = (RadioButton) findViewById(R.id.answer_question4b);
        boolean check = right.isChecked();
        if (check) {
            score += 1;
        }
        else {
            return;
        }
    }

    public void questionThree (View view){
        EditText text = (EditText) findViewById(R.id.answer_question2);
        String value = text.getText().toString();
        String result = "Past Tense";
        if (value.equals(result)) {
            score += 1;
        } else {
            return;
        }

    }

    public void questionFour(View view){

        EditText textt = (EditText) findViewById(R.id.answer_question3);
        String value1 = textt.getText().toString();
        String result = "Future Tense";
        if (value1.equals(result)) {
            score += 1;
        } else {
            return;
        }
    }

    public void Submit(View view) {
        questionThree(view);
        questionFour(view);
        if (score <= 4) {
            display(score);
        } else {
            return;
        }
    }
    public void display(int scoree) {
        TextView scores = (TextView) findViewById(R.id.Result);
        scores.setText(String.valueOf(scoree));

    }
}
