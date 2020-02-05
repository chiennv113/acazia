package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EnterVerifyCodeActivity extends AppCompatActivity {

    private ImageView mImgArrBack;
    private TextView mTvPhoneNumber;
    private PinEntryEditText mPinEntryEditText;
    private FloatingActionButton mFabNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_verify_code);
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
                startActivity(new Intent(EnterVerifyCodeActivity.this, CreateAccountActivity.class));
            }
        });
        Intent intent = getIntent();
        String number = intent.getStringExtra("PhoneNumber");
        Log.e("GGG", "onCreate: " + number);
        mTvPhoneNumber.setText(number);
    }

    private void initView() {
        mImgArrBack = findViewById(R.id.imgArrBack);
        mTvPhoneNumber = findViewById(R.id.tvPhoneNumber);
        mPinEntryEditText = findViewById(R.id.edtCode);
        mFabNext = findViewById(R.id.fabNext);
    }
}
