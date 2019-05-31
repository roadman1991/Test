package com.example.test;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainContentActivity extends AppCompatActivity {

    TextView mTextField;
    ImageButton heart;
    TextView count;
    Integer number_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);
        count = (TextView) findViewById(R.id.clickCount);
        mTextField = (TextView) findViewById(R.id.countdown);
        heart = (ImageButton) findViewById(R.id.heartButton);
        number_count = 0;
        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_count += 1;
            }
        });
        new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                mTextField.setText(""+ millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("done!");
                count.setText("Ergebnis: " + number_count.toString());
                MyProperties.getInstance().someValueIWantToKeep = number_count;
                openResultActivity();

            }
        }.start();
    }

    private void openResultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
