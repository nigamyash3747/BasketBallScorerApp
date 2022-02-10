package com.example.courtcounter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreA(int score){
        TextView text = (TextView) findViewById(R.id.textViewA);
        text.setText(String.valueOf(score));
    }

    public void displayScoreB(int score){
        TextView text = (TextView) findViewById(R.id.textViewB);
        text.setText(String.valueOf(score));
    }


//teams 2?

    public void add2_team_a(View view) {
        teamAScore += 2;
        displayScoreA(teamAScore);
    }

    public void add3_team_a(View view) {
        teamAScore += 3;
        displayScoreA(teamAScore);
    }

    public void freeThrow_team_a(View view) {
        teamAScore += 1;
        displayScoreA(teamAScore);
    }

    public void add2_team_b(View view) {
        teamBScore += 2;
        displayScoreB(teamBScore);
    }

    public void add3_team_b(View view) {
        teamBScore += 3;
        displayScoreB(teamBScore);
    }
    public void freeThrow_team_b(View view) {
        teamBScore += 1;
        displayScoreB(teamBScore);
    }


    public void reset(View view) {
        teamBScore = 0;
        teamAScore = 0;

        displayScoreA(teamAScore);
        displayScoreB(teamBScore);
    }
}
