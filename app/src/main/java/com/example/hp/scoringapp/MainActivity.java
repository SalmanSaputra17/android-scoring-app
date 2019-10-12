package com.example.hp.scoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    protected void displayForTeamA(int score) {
        TextView teamA = (TextView) findViewById(R.id.team_a_score);
        teamA.setText(String.valueOf(score));
    }

    protected void displayForTeamB(int score) {
        TextView teamA = (TextView) findViewById(R.id.team_b_score);
        teamA.setText(String.valueOf(score));
    }

}
