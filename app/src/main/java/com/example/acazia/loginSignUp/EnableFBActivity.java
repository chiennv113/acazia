package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;

public class EnableFBActivity extends AppCompatActivity {

    private Button mBtnConectToFb;
    private TextView mTvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable_fb);
        initView();
        mTvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnableFBActivity.this, ConnectContactActivity.class));
            }
        });
    }

    private void initView() {
        mBtnConectToFb = findViewById(R.id.btnEnablePush);
        mTvSkip = findViewById(R.id.tvSkip);
    }
}
