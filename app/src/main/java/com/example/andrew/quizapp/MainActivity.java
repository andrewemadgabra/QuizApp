package com.example.andrew.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int final_grade = 0;
    RadioGroup mRadioGroup;
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
            final_grade += 1;
        } else {
            return;
        }
    }

    public void questionTWO(View view) {
        EditText text = (EditText) findViewById(R.id.et_answer_question2);
        String value = text.getText().toString();
        String result = "Past Tense";
        if (value.equals(result)) {
            final_grade += 1;
        } else {
            return;
        }
    }

    public void questionTHREE(View view) {
        EditText textt = (EditText) findViewById(R.id.et_answer_question3);
        String value1 = textt.getText().toString();
        String result = "Future Tense";
        if (value1.equals(result)) {
            final_grade += 1;
        } else {
            return;
        }
    }
    public void onRadioButtonClicked(View view) {
        RadioButton right = (RadioButton) findViewById(R.id.rb_answer_question4b);
        if (right.isChecked()) {
            final_grade += 1;
        } else {
            return;
        }
    }
    public void Submit(View view) {
        String Display;
        questionTWO(view);
        questionTHREE(view);
        if (final_grade < 4) {
            Display = "Try again. You scored " + final_grade + " out of 4";
            Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_LONG).show();
            final_grade=0;
        } else if(final_grade==4) {
            Display = "You scored " + final_grade + " out of 4";
            Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_LONG).show();
            final_grade=0;
        }
        CheckBox checkA = (CheckBox) findViewById(R.id.cb_answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.cb_answer_question1b);
        CheckBox checkC = (CheckBox) findViewById(R.id.cb_answer_question1c);
        CheckBox checkD = (CheckBox) findViewById(R.id.cb_answer_question1d);
        checkA.setChecked(false);
        checkB.setChecked(false);
        checkC.setChecked(false);
        checkD.setChecked(false);
        EditText clear = (EditText) findViewById(R.id.et_answer_question3);
        clear.setText("");
        EditText delete = (EditText) findViewById(R.id.et_answer_question2);
        delete.setText("");
        mRadioGroup = (RadioGroup) findViewById(R.id.radiogroup1);
        mRadioGroup.clearCheck();
    }
}
