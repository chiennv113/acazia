package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class CreateAccountActivity extends AppCompatActivity {

    private TextInputEditText mEdtPass;
    private ImageView mImgArrBack;
    private TextInputEditText mEdtName;
    private TextInputEditText mEdtEmail;
    private FloatingActionButton mFabNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        initView();
        mImgArrBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        mFabNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateAccountActivity.this, CreateProfileActivity.class));
            }
        });
    }

    private void initView() {
        mEdtPass = findViewById(R.id.edtPass);
        mImgArrBack = findViewById(R.id.imgArrBack);
        mEdtName = findViewById(R.id.edtUserName);
        mEdtEmail = findViewById(R.id.edtEmail);
        mFabNext = findViewById(R.id.fabNext);
    }
}
