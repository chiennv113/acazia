package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class CreateProfileActivity extends AppCompatActivity {

    private ImageView mImgBack;
    private FrameLayout mAddImg;
    private FloatingActionButton mFloatingActionButton;
    private TextInputEditText mEdtBirth;
    private TextInputEditText mEdtCity;
    private TextInputEditText mEdtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        initView();
        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        mAddImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateProfileActivity.this, "ssssssssss", Toast.LENGTH_SHORT).show();
            }
        });
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateProfileActivity.this, ProfileCreatedActivity.class));
            }
        });
    }

    private void initView() {
        mImgBack = findViewById(R.id.imgBack);
        mAddImg = findViewById(R.id.addImg);
        mFloatingActionButton = findViewById(R.id.floatingActionButton);
        mEdtBirth = findViewById(R.id.edtBirth);
        mEdtCity = findViewById(R.id.edtCity);
        mEdtUserName = findViewById(R.id.edtUserName);
    }
}
