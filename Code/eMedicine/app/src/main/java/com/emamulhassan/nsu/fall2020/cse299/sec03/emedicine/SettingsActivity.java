package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingsActivity extends AppCompatActivity

    private TextView closeTextBtn, saveTextButton;
    private CircleImageView profileImageView;
    private TextView profileChangeTextBtn;
    private EditText fullNameEditText, userPhoneEditText, addressEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        closeTextBtn = (TextView) findViewById(R.id.close_settings_btn);
        saveTextButton = (TextView) findViewById(R.id.update_account_settings_btn);
        profileImageView = (CircleImageView) findViewById(R.id.settings_profile_image);
        profileChangeTextBtn = (TextView) findViewById(R.id.profile_image_change_btn);
        fullNameEditText = (EditText) findViewById(R.id.settings_full_name);
        userPhoneEditText = (EditText) findViewById(R.id.settings_phone_number);
        addressEditText = (EditText) findViewById(R.id.settings_address);


        
    }
}