package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ResetPassPhoneActivity extends AppCompatActivity {

    private ImageView mImgArrowback;
    private Spinner mSpinner2;
    private FloatingActionButton mBtnArrNext;
    private TextView mTvSignIn;
    private EditText mEdtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass_phone);
        initView();
        mImgArrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        mBtnArrNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResetPassPhoneActivity.this, ResetPassVerifyActivity.class));
            }
        });
    }

    private void initView() {
        mImgArrowback = findViewById(R.id.imgArrowback);
        mSpinner2 = findViewById(R.id.spinner2);
        mBtnArrNext = findViewById(R.id.btn_arr_next);
        mTvSignIn = findViewById(R.id.tvSignIn);
        mEdtPhoneNumber = findViewById(R.id.edtPhoneNumber);
    }
}
