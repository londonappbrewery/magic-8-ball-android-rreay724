package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // Creates an array
        final int[] ballArray = new int [] {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };


        Button myButton = findViewById(R.id.askButton);

        // tell the button to listen for clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this code gets executed when the button is pressed

                // This will test that the button has been pressed
                Log.d("eightBall", "It has been asked!");

                // This will cause the images to show at random
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                int imageResourceId = ballArray[number];  // used to pull specific resource out of ball array

                // test that it is randomly generating numbers
                Log.d("eightBall", "The random numbers is: " + number);

                // Set the ball image using an image from the ball array
                ballDisplay.setImageResource(imageResourceId);

            }
        });


    }
}
