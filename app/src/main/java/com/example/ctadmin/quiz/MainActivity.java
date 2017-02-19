package com.example.ctadmin.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int id1;
    int id2;
    int id3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button score=(Button)findViewById(R.id.score);
        Button retry=(Button)findViewById(R.id.retry);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorecount=0;
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.rg2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.rg3);
                id1=rg1.getCheckedRadioButtonId();
                id2=rg2.getCheckedRadioButtonId();
                id3=rg3.getCheckedRadioButtonId();
                View rb1 = rg1.findViewById(id1);
                int s1 = rg1.indexOfChild(rb1);
                View rb2 = rg1.findViewById(id2);
                int s2 = rg1.indexOfChild(rb2);
                View rb3 = rg1.findViewById(id3);
                int s3 = rg1.indexOfChild(rb3);
                if(s1==1)
                    scorecount=scorecount+1;
                if(s2==2)
                    scorecount=scorecount+1;
                if(s3==3)
                    scorecount=scorecount+1;
                Toast.makeText(MainActivity.this, "Your score is " +scorecount,
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}
