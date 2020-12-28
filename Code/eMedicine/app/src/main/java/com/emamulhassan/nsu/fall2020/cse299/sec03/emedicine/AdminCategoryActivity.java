package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView medicine, babyCare;
    private ImageView feminineHygine, diabetesMedicine,;
    private ImageView painRelief, others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        medicine = (ImageView) findViewById(R.id.m_tablet);
        babyCare = (ImageView) findViewById(R.id.m_baby);

        feminineHygine = (ImageView) findViewById(R.id.m_feminine);
        diabetesMedicine = (ImageView) findViewById(R.id.m_diabetes);

        painRelief = (ImageView) findViewById(R.id.m_pain);
        others = (ImageView) findViewById(R.id.m_others);


        


    }
}