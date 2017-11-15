package com.sujay.play.cricketquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int correctAnswersCount = 0;
    int quesOneAnsweredTimes = 0;
    int quesTwoAnsweredTimes = 0;
    int quesThreeAnsweredTimes = 0;
    int quesFourAnsweredTimes = 0;
    int quesFiveAnsweredTimes = 0;
    int quesSixAnsweredTimes = 0;
    int quesSevenAnseweredTimes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method checks the answer of question 1
     *
     * @param view
     */
    public void questionOne(View view) {

        RadioButton correctRadioButton = findViewById(R.id.players_number_true_radio_button);

        if (quesOneAnsweredTimes == 0) {
            if (correctRadioButton.isChecked()) {
                correctAnswersCount = correctAnswersCount + 1;
                quesOneAnsweredTimes++;
            }
        } else {
            if (!correctRadioButton.isChecked()) {
                correctAnswersCount--;
                quesOneAnsweredTimes = 0;
            }
        }
    }

    /**
     * this method checks the answer of question 2
     *
     * @param view
     */
    public void questionTwo(View view) {

        RadioButton correctRadioButton = findViewById(R.id.batsman_true_radio_button);

        if (quesTwoAnsweredTimes == 0) {
            if (correctRadioButton.isChecked()) {
                correctAnswersCount = correctAnswersCount + 1;
                quesTwoAnsweredTimes++;
            }
        } else {
            if (!correctRadioButton.isChecked()) {
                correctAnswersCount--;
                quesTwoAnsweredTimes = 0;
            }
        }
    }

    /**
     * this method checks the answer of question 3
     *
     * @param view
     */
    public void questionThree(View view) {

        RadioButton correctRadioButton = findViewById(R.id.overs_true_radio_button);
        if (quesThreeAnsweredTimes == 0) {
            if (correctRadioButton.isChecked()) {
                correctAnswersCount = correctAnswersCount + 1;
                quesThreeAnsweredTimes++;
            }
        } else {
            if (!correctRadioButton.isChecked()) {
                correctAnswersCount--;
                quesThreeAnsweredTimes = 0;
            }
        }
    }

    /**
     * this method checks the answer of question 4
     *
     * @param view
     */
    public void questionFour(View view) {

        RadioButton correctRadioButton = findViewById(R.id.world_cup_true_radio_button);

        if (quesFourAnsweredTimes == 0) {
            if (correctRadioButton.isChecked()) {
                correctAnswersCount = correctAnswersCount + 1;
                quesFourAnsweredTimes++;
            }
        } else {
            if (!correctRadioButton.isChecked()) {
                correctAnswersCount--;
                quesFourAnsweredTimes = 0;
            }
        }
    }

    /**
     * this method checks answer of question 5 which is EditText
     *
     * @param view
     */
    public void questionFive(View view) {

        EditText correctEditText = findViewById(R.id.captain_edit_text);

        if (quesFiveAnsweredTimes == 0) {
            if (String.valueOf(correctEditText.getText().toString().trim()).equalsIgnoreCase("kapil dev")) {
                correctAnswersCount = correctAnswersCount + 1;
                quesFiveAnsweredTimes++;
            }
        } else {
            if (!String.valueOf(correctEditText.getText().toString().trim()).equalsIgnoreCase("kapil dev")) {
                correctAnswersCount--;
                quesFiveAnsweredTimes = 0;
            }
        }
    }

    /**
     * this method checks the answer of question 6
     *
     * @param view
     */
    public void questionSix(View view) {

        RadioButton correctRadioButton = findViewById(R.id.pitch_yards_true_radio_button);

        if (quesSixAnsweredTimes == 0) {
            if (correctRadioButton.isChecked()) {
                correctAnswersCount = correctAnswersCount + 1;
                quesSixAnsweredTimes++;
            }
        } else {
            if (!correctRadioButton.isChecked()) {
                correctAnswersCount--;
                quesSixAnsweredTimes = 0;
            }
        }
    }

    public void questionSeven(View view) {
        CheckBox correctCheckBox = findViewById(R.id.true_check_box);
        CheckBox correctCheckBox1 = findViewById(R.id.true1_check_box);
        CheckBox correctCheckBox2 = findViewById(R.id.true2_check_box);
        CheckBox incorrectCheckBox3 = findViewById(R.id.false_check_box);
        if (quesSevenAnseweredTimes == 0) {
            if ((correctCheckBox.isChecked() && correctCheckBox1.isChecked() && correctCheckBox2.isChecked()) && !(incorrectCheckBox3.isChecked())) {
                correctAnswersCount = correctAnswersCount + 1;
                quesSevenAnseweredTimes++;
            }
        } else {
            if (!(correctCheckBox.isChecked() && correctCheckBox1.isChecked() && correctCheckBox2.isChecked()) || incorrectCheckBox3.isChecked()) {
                correctAnswersCount--;
                quesSevenAnseweredTimes = 0;
            }
        }
    }

    public void knowYourScore(View view) {
        questionFive(view);
        questionSeven(view);
        calculatePercentage(correctAnswersCount);
    }

    /**
     * this method calculates percentage of correct answers
     *
     * @param count
     */
    public void calculatePercentage(int count) {
        int percentage = (count * 100) / 7;
        TextView scoreTextView = findViewById(R.id.score_answer_text_view);
        if (percentage == 100)
            scoreTextView.setText("Bingo! Master your score is " + String.valueOf(percentage) + "%");
        else if (percentage > 80)
            scoreTextView.setText("Excellent! Your score is " + String.valueOf(percentage) + "%");
        else if (percentage > 70)
            scoreTextView.setText("Good! Your score is " + String.valueOf(percentage) + "%");
        else if (percentage > 50)
            scoreTextView.setText("Ok! Your score is " + String.valueOf(percentage) + "%");
        else
            scoreTextView.setText("You hate cricket :( Your score is " + String.valueOf(percentage) + "%");
    }

    /**
     * this method reset the quiz
     *
     * @param view
     */
    public void reset(View view) {
        correctAnswersCount = 0;
        quesOneAnsweredTimes = 0;
        quesTwoAnsweredTimes = 0;
        quesThreeAnsweredTimes = 0;
        quesFourAnsweredTimes = 0;
        quesFiveAnsweredTimes = 0;
        quesSixAnsweredTimes = 0;
        quesSevenAnseweredTimes = 0;
        EditText editText = findViewById(R.id.captain_edit_text);
        editText.setText("");
        RadioGroup radioGroupOne = findViewById(R.id.ques_one_radio_group);
        radioGroupOne.clearCheck();
        RadioGroup radioGroupTwo = findViewById(R.id.ques_two_radio_group);
        radioGroupTwo.clearCheck();
        RadioGroup radioGroupThree = findViewById(R.id.ques_three_radio_group);
        radioGroupThree.clearCheck();
        RadioGroup radioGroupFour = findViewById(R.id.ques_four_radio_group);
        radioGroupFour.clearCheck();
        RadioGroup radioGroupFive = findViewById(R.id.ques_six_radio_group);
        radioGroupFive.clearCheck();
        CheckBox checkBoxOne = findViewById(R.id.true_check_box);
        checkBoxOne.setChecked(false);
        CheckBox checkBoxTwo = findViewById(R.id.false_check_box);
        checkBoxTwo.setChecked(false);
        CheckBox checkBoxThree = findViewById(R.id.true1_check_box);
        checkBoxThree.setChecked(false);
        CheckBox checkBoxFour = findViewById(R.id.true2_check_box);
        checkBoxFour.setChecked(false);
        TextView scoreTextView = findViewById(R.id.score_answer_text_view);
        scoreTextView.setText("Score : 0");
    }
}
