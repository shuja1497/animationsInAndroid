package com.shuja1497.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fadeIn , fadeOut, crossFading, blink , zoomIn, rotate, move , slideUp , clockwise, bounce, seqAnim, togetherAnim;
    ImageView image, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView);

        fadeIn = findViewById(R.id.fadeIn);
        fadeOut = findViewById(R.id.fadeOut);
        crossFading = findViewById(R.id.crossFading);
        blink = findViewById(R.id.blink);
        zoomIn = findViewById(R.id.zoomIn);
        rotate = findViewById(R.id.rotate);
        move = findViewById(R.id.move);
        slideUp = findViewById(R.id.slideUp);
        clockwise = findViewById(R.id.clockwise);
        bounce = findViewById(R.id.bounce);
        seqAnim = findViewById(R.id.seqAnim);
        togetherAnim = findViewById(R.id.togetherAnim);


        fadeIn.setOnClickListener(this);
        fadeOut.setOnClickListener(this);
        crossFading.setOnClickListener(this);
        blink.setOnClickListener(this);
        zoomIn.setOnClickListener(this);
        rotate.setOnClickListener(this);
        move.setOnClickListener(this);
        slideUp.setOnClickListener(this);
        clockwise.setOnClickListener(this);
        bounce.setOnClickListener(this);
        seqAnim.setOnClickListener(this);
        togetherAnim.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case  R.id.fadeIn:
                Animation fadeinAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_in);
                image.startAnimation(fadeinAnim);
                break;

            case R.id.fadeOut:
                Animation fadeoutAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_out);
                image.startAnimation(fadeoutAnim);
                break;

            case R.id.crossFading:
                fadeoutAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_in);
                fadeinAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade_in);
                image.startAnimation(fadeoutAnim);
                image2.startAnimation(fadeinAnim);
                break;

            case R.id.blink:
                Animation blinkAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);
                image.startAnimation(blinkAnim);
                break;

            case R.id.zoomIn:
                Animation zoomAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom_in);
                image.startAnimation(zoomAnim);
                break;

            case R.id.rotate:
                Animation rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.rotate);
                image.startAnimation(rotateAnim);
                break;

            case R.id.move:
                Animation moveAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.move);
                image.startAnimation(moveAnim);
                break;

            case R.id.slideUp:
                Animation slideUpanim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_up);
                image.startAnimation(slideUpanim);
                break;

            case R.id.clockwise:
                Animation clockAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.clockwise);
                image.startAnimation(clockAnim);
                break;

            case R.id.bounce:
                Animation bounceAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.bounce);
                image.startAnimation(bounceAnim);
                break;

            case R.id.seqAnim:
                Animation seqAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.seq_anim);
                image.startAnimation(seqAnim);
                break;

            case R.id.togetherAnim:
                Animation togetherAnim = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.together_anim);
                image.startAnimation(togetherAnim);
                break;


        }
    }
}
