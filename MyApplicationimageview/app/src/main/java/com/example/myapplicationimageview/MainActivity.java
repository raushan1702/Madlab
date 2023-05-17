package com.example.myapplicationimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isegg=true;
    public void change(View view){
        ImageView iv=findViewById(R.id.imageView3);
        if(isegg) {


            iv.setImageResource(R.drawable.mother);
            isegg = false;
        }else{
            iv.setImageResource(R.drawable.egg);
            isegg=true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}