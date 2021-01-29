package com.sonorousduck.inclasswatch;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton myButton = findViewById(R.id.my_button);
        AppCompatButton myButton2 = findViewById(R.id.my_button_2);

// You could do this.

//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });


        myButton.setOnClickListener((view -> {
                Log.d("BUTTON", "My button was pressed");
        }));

        myButton2.setOnClickListener((view -> {
            Log.d("BUTTON2", "Second button was pressed");
        }));


        mTextView = findViewById(R.id.text);

    }

}