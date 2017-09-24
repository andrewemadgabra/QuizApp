package com.example.andrew.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score1,score2,score3,score4,final_grade ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectitem(View view) {
        CheckBox checkA = (CheckBox) findViewById(R.id.cb_answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.cb_answer_question1b);
        CheckBox checkC = (CheckBox) findViewById(R.id.cb_answer_question1c);
        CheckBox checkD = (CheckBox) findViewById(R.id.cb_answer_question1d);
        if (checkA.isChecked() && checkB.isChecked() && !checkC.isChecked() && !checkD.isChecked()) {
            score1 += 1;
        } else {
            score1 = 0;
        }
    }

    public void questionTWO(View view) {
        EditText text = (EditText) findViewById(R.id.et_answer_question2);
        String value = text.getText().toString();
        String result = "Past Tense";
        if (value.equals(result)) {
            score2 += 1;
        } else {
            score2 = 0;
        }
    }

    public void questionTHREE(View view) {
        EditText textt = (EditText) findViewById(R.id.et_answer_question3);
        String value1 = textt.getText().toString();
        String result = "Future Tense";
        if (value1.equals(result)) {
            score3 += 1;
        } else {
            score3 = 0;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton right = (RadioButton) findViewById(R.id.rb_answer_question4b);
        if (right.isChecked()) {
            score4 += 1;
        } else {
            score4 = 0;
        }
    }

    public void Submit(View view) {
        String Display;
        questionTWO(view);
        questionTHREE(view);
        final_grade = score1+score2+score3+score4;
        if (final_grade == 10) {
            Display = "Perfect! You scored 4 out of 4";
        } else {
            Display = "Try again. You scored " + final_grade + " out of 4";
        }
        Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_LONG).show();
        EditText clear = (EditText) findViewById(R.id.et_answer_question3);
        clear.setText("");
        EditText delete = (EditText) findViewById(R.id.et_answer_question2);
        delete.setText("");
    }
}
