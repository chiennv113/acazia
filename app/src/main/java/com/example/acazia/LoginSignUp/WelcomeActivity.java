package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button mBtnLoginWithFb;
    private Button mBtnLoginWithPhone;
    private TextView mTvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mBtnLoginWithPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this, EnterPhoneNumberActivity.class));
            }
        });
        mTvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this, SignInActivity.class));
            }
        });
    }

    private void initView() {
        mBtnLoginWithFb = findViewById(R.id.btnLoginWithFb);
        mBtnLoginWithPhone = findViewById(R.id.btnLoginWithPhone);
        mTvLogin = findViewById(R.id.tvLogin);
    }
}
