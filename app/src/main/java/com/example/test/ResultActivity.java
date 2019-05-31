package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView ergebnis;
    Integer number_ergebnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        number_ergebnis = MyProperties.getInstance().someValueIWantToKeep;
        ergebnis = (TextView) findViewById(R.id.ergebnis);
        ergebnis.setText(number_ergebnis.toString());
    }
}
/**/