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

    public void selectitem(View view) {
        CheckBox checkA = (CheckBox) findViewById(R.id.cb_answer_question1a);
        CheckBox checkB = (CheckBox) findViewById(R.id.cb_answer_question1b);
        CheckBox checkC = (CheckBox) findViewById(R.id.cb_answer_question1c);
        CheckBox checkD = (CheckBox) findViewById(R.id.cb_answer_question1d);
        if (checkA.isChecked() && checkB.isChecked() && !checkC.isChecked() && !checkD.isChecked()) {
            final_grade += 1;
        }
    }

    public void questionTWO(View view) {
        EditText text = (EditText) findViewById(R.id.et_answer_question2);
        String value = text.getText().toString();
        String resultone = "Past Tense";
	String resulttwo = "past tense";
        if (value.equals(resultone)||value.equals(resulttwo)) {
            final_grade += 1;
        }
    }

    public void questionTHREE(View view) {
        EditText textt = (EditText) findViewById(R.id.et_answer_question3);
        String value1 = textt.getText().toString();
        String resultone = "Future Tense";
	String resulttwo = "future tense";
        if (value1.equals(resultone)||value1.equals(resulttwo)) {
            final_grade += 1;
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioButton answer1 = (RadioButton) findViewById(R.id.rb_answer_question4a);
        RadioButton answer2 = (RadioButton) findViewById(R.id.rb_answer_question4b);
        RadioButton answer3 = (RadioButton) findViewById(R.id.rb_answer_question4c);
        Boolean answer;
        answer=answer2.isChecked();
        if (answer) {
            final_grade += 1;
        }

    }

    public void Submit(View view) {
        String Display;
        questionTWO(view);
        questionTHREE(view);
        if (final_grade < 4) {
            Display = "Try again. You scored " + final_grade + " out of 4";
            Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_SHORT).show();
            final_grade = 0;
        } else if (final_grade == 4) {
            Display = "You scored " + final_grade + " out of 4";
            Toast.makeText(getApplicationContext(), "Your Result : " + Display, Toast.LENGTH_SHORT).show();
            final_grade = 0;
        } else {
            final_grade = 0;
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
