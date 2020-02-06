package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ResetPassVerifyActivity extends AppCompatActivity {

    private ImageView mImgArrBack;
    private PinEntryEditText mEdtCode;
    private FloatingActionButton mFabNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass_verify);
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
                startActivity(new Intent(ResetPassVerifyActivity.this, ResetPassNewPassActivity.class));
            }
        });
    }

    private void initView() {
        mImgArrBack = findViewById(R.id.imgArrBack);
        mEdtCode = findViewById(R.id.edtCode);
        mFabNext = findViewById(R.id.fabNext);
    }
}
