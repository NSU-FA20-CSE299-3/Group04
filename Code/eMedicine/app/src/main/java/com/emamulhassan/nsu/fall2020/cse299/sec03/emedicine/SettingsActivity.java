package com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.emamulhassan.nsu.fall2020.cse299.sec03.emedicine.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingsActivity extends AppCompatActivity{

    private TextView closeTextBtn, saveTextButton;
    private CircleImageView profileImageView;
    private TextView profileChangeTextBtn;
    private EditText fullNameEditText, userPhoneEditText, addressEditText;

    private Uri uri;
    private String myUrl = "";
    private StorageReference storageProfilePrictureRef;
    private String checker = "";




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


        userInfoDisplay(profileImageView, fullNameEditText, userPhoneEditText, addressEditText);

        closeTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        saveTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });




    }

        private void userInfoDisplay(CircleImageView profileImageView, EditText fullNameEditText, EditText userPhoneEditText, EditText addressEditText)
        {
            DatabaseReference UserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(Prevalent.currentOnlineUser.getPhone());

            UserRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists())
                    {
                        if (snapshot.child("image").exists())
                        {
                            String image = snapshot.child("image").getValue().toString();
                            String name = snapshot.child("name").getValue().toString();
                            String phone = snapshot.child("phone").getValue().toString();
                            String address = snapshot.child("address").getValue().toString();

                            Picasso.get().load(image).into(profileImageView);
                            fullNameEditText.setText(name);
                            userPhoneEditText.setText(phone);
                            addressEditText.setText(address);
                        }
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }
}