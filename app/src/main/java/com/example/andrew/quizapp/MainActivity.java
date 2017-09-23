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
    int score = 0;
    Button button1;
    EditText answer1 ,answer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1=(EditText) findViewById(R.id.et_answer_question2);
        answer2=(EditText) findViewById(R.id.et_answer_question3);
        button1=(Button) findViewById(R.id.submit_button);
    }

    public void selectitem(View view) {
        CheckBox checkA = (CheckBox) findViewById(R.id.cb_answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.cb_answer_question1b);
        if (checkA.isChecked() && checkB.isChecked()) {
            score += 1;
        } else {
            return;
        }
    }

    public void questionTWO(View view) {
        EditText text = (EditText) findViewById(R.id.et_answer_question2);
        String value = text.getText().toString();
        String result = "Past Tense";
        if (value.equals(result)) {
            score += 1;
        } else {
            return;
        }
    }

    public void questionTHREE(View view) {
        EditText textt = (EditText) findViewById(R.id.et_answer_question3);
        String value1 = textt.getText().toString();
        String result = "Future Tense";
        if (value1.equals(result)) {
            score += 1;
        } else {
            return;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton right = (RadioButton) findViewById(R.id.rb_answer_question4b);
        if (right.isChecked()) {
            score += 1;
        } else {
            return;
        }
    }

    public void Submit(View view) {
        questionTWO(view);
        questionTHREE(view);
        if (score <= 4) {
            display(score);
        } else {
            return;
        }
    }

    public void display(int scoree) {
        Toast.makeText(getApplicationContext(), "Your Result : " + score, Toast.LENGTH_LONG).show();
        EditText clear=(EditText) findViewById(R.id.et_answer_question3);
        clear.setText("");
        EditText delete=(EditText) findViewById(R.id.et_answer_question2);
        delete.setText("");
        score=0;
    }
}
