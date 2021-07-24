package com.example.finalsliderviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LikesActivity extends AppCompatActivity {
    private ImageView cancel1;
    private ConstraintLayout constraintLayout;
    private CardView cardView;
    private ImageView cancel2;
    private ImageView cancel3;
    private ImageView cancel4;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes);
        cancel1=findViewById(R.id.vivianCancel);
        cardView=findViewById(R.id.cardview1);
        cardView3=findViewById(R.id.cardview3);
        cardView4=findViewById(R.id.cardview4);
        cancel3=findViewById(R.id.rohitcancel);
        cancel4=findViewById(R.id.sohanicancel);
        cancel2=findViewById(R.id.ranocancle);
        cardView2=findViewById(R.id.cardview2);
        constraintLayout=findViewById(R.id.constraintView);
        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               constraintLayout.removeView(cardView);
            }
        });
        cancel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout.removeView(cardView2);
            }
        });
        cancel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout.removeView(cardView3);
            }
        });
        cancel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout.removeView(cardView4);
            }
        });
    }
}