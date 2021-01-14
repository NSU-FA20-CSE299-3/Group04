package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView medicine, babyCare;
    private ImageView feminineHygine, diabetesMedicine;
    private ImageView painRelief, others;
    private Button AdminLogout;

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

        AdminLogout = (Button) findViewById(R.id.admin_logout);

        AdminLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Medicine");
                startActivity(intent);
            }
        });

        babyCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Baby Care");
                startActivity(intent);
            }
        });


        feminineHygine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Feminine Hygiene");
                startActivity(intent);
            }
        });


        diabetesMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Diabetes Medicine");
                startActivity(intent);
            }
        });


        painRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pain Relief");
                startActivity(intent);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Others");
                startActivity(intent);
            }
        });


    }
}