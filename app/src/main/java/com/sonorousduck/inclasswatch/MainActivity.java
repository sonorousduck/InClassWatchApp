package com.sonorousduck.inclasswatch;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class MainActivity extends AppCompatActivity {

    private long count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton plus_button = findViewById(R.id.plus_button);
        AppCompatButton minus_button = findViewById(R.id.minus_button);


// You could do this.

//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


        plus_button.setOnClickListener((view -> {
            count++;
            AppCompatTextView textView = findViewById(R.id.message);
            textView.setText("" + count);
        }));

        minus_button.setOnClickListener((view -> {
            count--;
            AppCompatTextView textView = findViewById(R.id.message);
            textView.setText("" + count);

        }));


    }

}