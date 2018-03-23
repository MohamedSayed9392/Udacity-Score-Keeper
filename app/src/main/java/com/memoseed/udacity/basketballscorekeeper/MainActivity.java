package com.memoseed.udacity.basketballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtScoreTeam1;
    Button btnFreeThrowTeam1;
    Button btnTwoPointTeam1;
    Button btnThreePointTeam1;
    TextView txtScoreTeam2;
    Button btnFreeThrowTeam2;
    Button btnTwoPointTeam2;
    Button btnThreePointTeam2;
    Button btnResetScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtScoreTeam1 = findViewById(R.id.txtScoreTeam1);
        btnFreeThrowTeam1  = findViewById(R.id.btnFreeThrowTeam1);
        btnTwoPointTeam1  = findViewById(R.id.btnTwoPointTeam1);
        btnThreePointTeam1  = findViewById(R.id.btnThreePointTeam1);
        txtScoreTeam2  = findViewById(R.id.txtScoreTeam2);
        btnFreeThrowTeam2  = findViewById(R.id.btnFreeThrowTeam2);
        btnTwoPointTeam2  = findViewById(R.id.btnTwoPointTeam2);
        btnThreePointTeam2  = findViewById(R.id.btnThreePointTeam2);
        btnResetScore  = findViewById(R.id.btnResetScore);

        btnFreeThrowTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    increaseTeam1Score(1);
            }
        });

        btnTwoPointTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseTeam1Score(2);
            }
        });

        btnThreePointTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseTeam1Score(3);
            }
        });

        btnFreeThrowTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseTeam2Score(1);
            }
        });

        btnTwoPointTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseTeam2Score(2);
            }
        });

        btnThreePointTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increaseTeam2Score(3);
            }
        });

        btnResetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllScore();
            }
        });
    }

    int team1Score = 0;
    private void increaseTeam1Score(int points){
        team1Score = team1Score + points;
        txtScoreTeam1.setText(String .valueOf(team1Score));
    }

    int team2Score = 0;
    private void increaseTeam2Score(int points){
        team2Score = team2Score + points;
        txtScoreTeam2.setText(String .valueOf(team2Score));
    }

    private void resetAllScore(){
        team1Score = 0;
        team2Score = 0;

        txtScoreTeam1.setText(String .valueOf(team1Score));
        txtScoreTeam2.setText(String .valueOf(team2Score));
    }

}
