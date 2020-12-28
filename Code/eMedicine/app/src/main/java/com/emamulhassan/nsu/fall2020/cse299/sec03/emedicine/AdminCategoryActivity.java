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


        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "medicine");
                startActivity(intent);
            }
        });

        babyCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "babyCare");
                startActivity(intent);
            }
        });

        babyCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "babyCare");
                startActivity(intent);
            }
        });


        feminineHygine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "feminineHygine");
                startActivity(intent);
            }
        });


        diabetesMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "diabetesMedicine");
                startActivity(intent);
            }
        });


        painRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "painRelief");
                startActivity(intent);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "others");
                startActivity(intent);
            }
        });


    }
}