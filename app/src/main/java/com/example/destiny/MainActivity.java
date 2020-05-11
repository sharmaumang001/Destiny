package com.example.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView story_view;
    Button answer1;
    Button answer2;
    int story_Index =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        story_view = findViewById(R.id.story_ID);
        answer1 = findViewById(R.id.T1);
        answer2= findViewById(R.id.T2);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (story_Index==1) {
                    story_view.setText(R.string.T3_Story);
                    answer1.setText(R.string.T3_Ans1);
                    answer2.setText(R.string.T3_Ans2);
                    story_Index = 3;
                }else if (story_Index==2){
                    story_view.setText(R.string.T3_Story);
                    answer1.setText(R.string.T3_Ans1);
                    answer2.setText(R.string.T3_Ans2);
                    story_Index =3;
                }else if (story_Index==3){
                    story_view.setText(R.string.T6_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (story_Index == 1) {
                    story_view.setText(R.string.T2_Story);
                    answer1.setText(R.string.T2_Ans1);
                    answer2.setText(R.string.T2_Ans2);
                    story_Index = 2;
                }else if (story_Index==2){
                    story_view.setText(R.string.T4_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                }else if (story_Index==3){
                    story_view.setText(R.string.T5_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                }

            }
        });

    }
}
