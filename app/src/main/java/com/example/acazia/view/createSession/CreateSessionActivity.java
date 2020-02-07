package com.example.acazia.view.createSession;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;

public class CreateSessionActivity extends AppCompatActivity {

    private ImageView mImgClose;
    private ImageView mImgNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_session);
        initView();
        mImgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    private void initView() {
        mImgClose = findViewById(R.id.imgClose);
        mImgNext = findViewById(R.id.imgNext);
    }
}
