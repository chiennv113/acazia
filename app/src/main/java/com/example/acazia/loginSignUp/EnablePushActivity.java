package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;

public class EnablePushActivity extends AppCompatActivity {

    private Button mBtnEnablePush;
    private TextView mTvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable_push);
        initView();
        mTvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnablePushActivity.this, SignInActivity.class));
            }
        });
    }

    private void initView() {
        mBtnEnablePush = findViewById(R.id.btnEnablePush);
        mTvSkip = findViewById(R.id.tvSkip);
    }
}
