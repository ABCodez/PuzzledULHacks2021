package com.example.Puzzled_ULHacks2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyPuzzle extends AppCompatActivity {
    /*App: Puzzled ULHACKS2021 Submission
      Creators: @AbCodez, @sahilrashid, @abdulwahab04
      Objective: The objective of this app is to display a puzzle alongside questions.
     */

    private QuestionsInfo qInfo = new QuestionsInfo(); //obtain assets from QuestionInfo.class

    //widgets declaration
    private ImageButton homeBtn;
    private TextView questionTextView;
    private TextView answerTextView;
    private Button optBtn1;
    private Button optBtn2;
    private Button optBtn3;
    private Button optBtn4;
    private ImageView puzzle;

    //instance variables
    private String answer;
    private int next=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_puzzle);

        //initializing widgets
        homeBtn = (ImageButton) findViewById(R.id.homeImgBtn);
        questionTextView = (TextView) findViewById(R.id.displayTextView);
        answerTextView = (TextView) findViewById(R.id.displayTextView2);
        optBtn1 = (Button) findViewById(R.id.optionBtn1);
        optBtn2 = (Button) findViewById(R.id.optionBtn2);
        optBtn3 = (Button) findViewById(R.id.optionBtn3);
        optBtn4 = (Button) findViewById(R.id.optionBtn4);
        puzzle = (ImageView) findViewById(R.id.puzzleImageView);

        update(); //update questions method

    }//OnCreate

    private void update() {
        /*This method updates the questions by accessing the array from questionsInfo.class
          By using the 'next', it's able to update all questions/textboxes/images and then move on
          to the next question to be performed. It also tracks the correct answer.
        */

        questionTextView.setText(qInfo.getQuestionArr(next));
        optBtn1.setText(qInfo.getOptionsArr1(next));
        optBtn2.setText(qInfo.getOptionsArr2(next));
        optBtn3.setText(qInfo.getOptionsArr3(next));
        optBtn4.setText(qInfo.getOptionsArr3(next));
        puzzle.setImageResource(qInfo.getImageArr(next));
        answer = qInfo.getCorrectArr(next);
        next++;
    }


    public void homeActivity(){
        //starts the menu activity
        Intent h = new Intent(EasyPuzzle.this, MainActivity.class);
        startActivity(h);
    }


    public void homeOnClick(View view) { homeActivity();}

    public void optOnClick1(View view) {
        /*If the option clicked is equal to the answer, then prompt the user with correct and update
          the question. Otherwise, prompt the user with try again, until they get the question correct.
         */
        if(optBtn1.getText() == answer){
            update();
            answerTextView.setText("Correct!");
        }
        else{
            answerTextView.setText("Try Again!");
        }
    }

    public void optOnClick2(View view) {
        /*If the option clicked is equal to the answer, then prompt the user with correct and update
          the question. Otherwise, prompt the user with try again, until they get the question correct.
         */
        if(optBtn2.getText() == answer){
            update();
            answerTextView.setText("Correct!");
        }
        else{
            answerTextView.setText("Try Again!");
        }
    }

    public void optOnClick3(View view) {
        /*If the option clicked is equal to the answer, then prompt the user with correct and update
          the question. Otherwise, prompt the user with try again, until they get the question correct.
         */
        if(optBtn3.getText() == answer){
            update();
            answerTextView.setText("Correct!");
        }
        else{
            answerTextView.setText("Try Again!");
        }
    }

    public void optOnClick4(View view) {
        /*If the option clicked is equal to the answer, then prompt the user with correct and update
          the question. Otherwise, prompt the user with try again, until they get the question correct.
         */
        if(optBtn4.getText() == answer){
            update();
            answerTextView.setText("Correct!");
        }
        else{
            answerTextView.setText("Try Again!");
        }
    }




}//EasyPuzzle