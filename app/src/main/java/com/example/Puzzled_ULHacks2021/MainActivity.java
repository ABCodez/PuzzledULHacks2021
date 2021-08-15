package com.example.Puzzled_ULHacks2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //widgets declaration
    private Button easyBtn;
    private TextView menuTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing widgets
        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);
        TextView menuTextView = findViewById(R.id.menuTextView);

        /*AnimationDrawable is used to animate the background of our app including one textView.
          There's an enter fade duration set in millis (2.5 seconds) and exit duration (5 seconds)
         */
        AnimationDrawable animationBg = (AnimationDrawable) constraintLayout.getBackground();
        AnimationDrawable animationBgMenu = (AnimationDrawable) menuTextView.getBackground();
        animationBg.setEnterFadeDuration(2000);
        animationBg.setExitFadeDuration(5000);
        animationBg.start();
        animationBg.setEnterFadeDuration(2500);
        animationBg.setExitFadeDuration(5000);
        animationBg.start();

        easyBtn =(Button) findViewById(R.id.menuBtn1);
        easyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                easyActivity(); //start activity onClick
            }
        });


    }

    private void easyActivity() {
        //start the puzzle activity
        Intent i = new Intent(MainActivity.this, EasyPuzzle.class);
        startActivity(i);
    }
}