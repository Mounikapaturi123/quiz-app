package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView question;
    TextView Totalquestions;
    Button ansa,ansb,ansc,ansd;
    Button btn;
    int score=0;
    int tot_ques=QuestionAnswer.question.length;
    int currquestion=0;
    String seltanswer=" ";




@Override
    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_main);

        Totalquestions=findViewById(R.id.total_question);
        question=findViewById(R.id.question);
        ansa=findViewById(R.id.ans_a);
        ansb=findViewById(R.id.ans_b);
        ansc=findViewById(R.id.ans_c);
        ansd=findViewById(R.id.ans_d);
        btn=findViewById(R.id.btn_submit);

        ansa.setOnClickListener(this);
        ansb.setOnClickListener(this);
        ansc.setOnClickListener(this);
        ansd.setOnClickListener(this);
        btn.setOnClickListener(this);


        Totalquestions.setText("Total Questions"+tot_ques);
        loadNewQuestion();


    }
    private void loadNewQuestion(){
        if(currquestion==tot_ques){
            finishquiz();
            return;
        }
        Totalquestions.setText((QuestionAnswer.question[currquestion]));
        ansa.setText(QuestionAnswer.choices[currquestion][0]);
        ansb.setText(QuestionAnswer.choices[currquestion][1]);
        ansc.setText(QuestionAnswer.choices[currquestion][2]);
        ansd.setText(QuestionAnswer.choices[currquestion][3]);

        seltanswer="";
    }
    private void finishquiz(){
        String passtatus;
        if(score>=tot_ques*0.7)
        {
            passtatus="PASSED";
        }
        else{
            passtatus="FAILED";
        }
        new AlertDialog.Builder(this)
                .setTitle(passtatus)
                .setMessage("your Score is"+score+"out of "+tot_ques)
                .setPositiveButton("Restart",(dialog, which) -> restartquiz() )
                .setCancelable(false)
                .show();
    }
    private void restartquiz(){
        score=0;
        currquestion=0;
        loadNewQuestion();
    }
    @Override
    public void onClick(View view){
        ansa.setBackgroundColor(Color.WHITE);
        ansb.setBackgroundColor(Color.WHITE);
        ansc.setBackgroundColor(Color.WHITE);
        ansd.setBackgroundColor(Color.WHITE);
        Button clickbutton=(Button) view;
        if(clickbutton.getId()==R.id.btn_submit){
            if(!seltanswer.isEmpty()){
                if (seltanswer.equals(QuestionAnswer.correctAnswers[currquestion])){
                    score++;
                }else{
                    clickbutton.setBackgroundColor(Color.RED);
                    currquestion++;
                    loadNewQuestion();
                }
            }else{

            }
        }else{
            seltanswer=clickbutton.getText().toString();
            clickbutton.setBackgroundColor(Color.GRAY);
        }
    }

}
