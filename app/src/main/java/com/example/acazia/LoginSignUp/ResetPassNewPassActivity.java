package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class ResetPassNewPassActivity extends AppCompatActivity {

    private ImageView mImgArrBack;
    private FloatingActionButton mFabNext;
    private TextInputEditText mEdtNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass_new_pass);
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
                startActivity(new Intent(ResetPassNewPassActivity.this, PasswordChangeActivity.class));
            }
        });
    }

    private void initView() {
        mImgArrBack = findViewById(R.id.imgArrBack);
        mFabNext = findViewById(R.id.fabNext);
        mEdtNewPassword = findViewById(R.id.edtNewPassword);
    }
}
