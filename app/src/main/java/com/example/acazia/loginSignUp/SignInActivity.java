package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.view.feed.FeedLocalAct;
import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class SignInActivity extends AppCompatActivity {

    private ImageView mImgBack;
    private TextView mTvForgotPass;
    private TextInputEditText mTvPhoneNumberEmail;
    private TextInputEditText mTvPassWord;
    private TextView mTvSignUp;
    private FloatingActionButton mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initView();

        mTvForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, ResetPassPhoneActivity.class));
            }
        });

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, FeedLocalAct.class));
            }
        });
    }

    private void initView() {
        mImgBack = findViewById(R.id.imgBack);
        mTvForgotPass = findViewById(R.id.tvForgotPass);
        mTvPhoneNumberEmail = findViewById(R.id.tvPhoneNumberEmail);
        mTvPassWord = findViewById(R.id.tvPassWord);
        mTvSignUp = findViewById(R.id.tvSignUp);
        mBtnNext = findViewById(R.id.btnNext);
    }
}
