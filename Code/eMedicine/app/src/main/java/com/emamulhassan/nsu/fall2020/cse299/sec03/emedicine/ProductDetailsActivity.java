package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class ProductDetailsActivity extends AppCompatActivity
{
    private ImageView productImage;
    private TextView productName, productDescription, productPrice;
    private ElegantNumberButton numberButton;
    private Button addToCartButton;
    private String productID = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        productImage = (ImageView) findViewById(R.id.product_image_details);
        productName = (TextView) findViewById(R.id.product_name_details);
        productDescription = (TextView) findViewById(R.id.product_description_details);
        productPrice = (TextView) findViewById(R.id.product_price_details);
        numberButton = (ElegantNumberButton) findViewById(R.id.number_btn);
        addToCartButton = (Button) findViewById(R.id.pd_add_to_cart_button);

        productID = getIntent().getStringExtra("pid");

        getProductDetails(productID);

    }

    private void getProductDetails(String productID)
    {

    }
}