package com.tj.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore=0;
    int teamBScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view){
        teamAScore=0;
        teamBScore=0;
        pointA(0);
        pointB(0);
    }

    public void pointA(int point) {
        TextView textViewA = (TextView) findViewById(R.id.teamaScore);
        teamAScore+=point;
        textViewA.setText(""+teamAScore);
    }

    public void pointB(int point) {
        TextView textViewB = (TextView) findViewById(R.id.teambScore);
        teamBScore+=point;
        textViewB.setText(""+teamBScore);
    }

    public void point1A(View view){
        pointA(1);
    }

    public void point2A(View view){
        pointA(2);
    }

    public void point3A(View view){
        pointA(3);
    }

    public void point1B(View view){
        pointB(1);
    }

    public void point2B(View view){
        pointB(2);
    }

    public void point3B(View view){
        pointB(3);
    }

}

//        another way to implement this process !!

//      public void point1A(View view){
//      TextView textViewA = (TextView) findViewById(R.id.teamaScore);
//      teamAScore+=1;
//      textViewA.setText(""+teamAScore);
//      }