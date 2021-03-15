package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numberList = new ArrayList<String>();

        numberList.add("one");
        numberList.add("two");
        numberList.add("three");
        numberList.add("four");
        numberList.add("five");
        numberList.add("six");
        numberList.add("seven");
        numberList.add("eight");
        numberList.add("nine");

        LinearLayout numbersLayout = findViewById(R.id.numbers_root_view);

        int index = 0;

        while (index < numberList.size()){
            TextView numberTextView = new TextView(this);
            numberTextView.setText(numberList.get(index));
            numbersLayout.addView(numberTextView);

            index++;
        }
    }
}