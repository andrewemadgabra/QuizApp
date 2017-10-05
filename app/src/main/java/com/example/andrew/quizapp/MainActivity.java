package com.example.andrew.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int final_grade = 0;
    RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void questionOne(View view) {
        CheckBox checkA = (CheckBox) findViewById(R.id.cb_answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.cb_answer_question1b);
        CheckBox checkC = (CheckBox) findViewById(R.id.cb_answer_question1c);
        CheckBox checkD = (CheckBox) findViewById(R.id.cb_answer_question1d);
        if (checkA.isChecked() && checkB.isChecked() && !checkC.isChecked() && !checkD.isChecked()) {
            final_grade++;
        } else {
            return;
        }
    }

    public void questionTWO(View view) {
        EditText text = (EditText) findViewById(R.id.et_answer_question2);
        boolean value = text.getText().toString().trim().equalsIgnoreCase("Past Tense");
        if (value) {
            final_grade++;
        } else {
            return;
        }
    }

    public void questionTHREE(View view) {
        EditText textt = (EditText) findViewById(R.id.et_answer_question3);
        boolean value = textt.getText().toString().trim().equalsIgnoreCase("Future Tense");
        if (value) {
            final_grade++;
        } else {
            return;
        }
    }

    public void questionFour(View view) {
        RadioButton answer1 = (RadioButton) findViewById(R.id.rb_answer_question4a);
        RadioButton answer2 = (RadioButton) findViewById(R.id.rb_answer_question4b);
        RadioButton answer3 = (RadioButton) findViewById(R.id.rb_answer_question4c);
        Boolean answer;
        answer = answer2.isChecked();
        if (answer) {
            final_grade++;
        } else {
            return;
        }
    }

    public void Submit(View view) {
        String Display;
        questionOne(view);
        questionTWO(view);
        questionTHREE(view);
        questionFour(view);
        Display = "You Scored " + final_grade + " out of 4";
        Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_SHORT).show();
        final_grade = 0;
    }
}
