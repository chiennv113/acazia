package com.example.acazia.loginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;

public class ProfileCreatedActivity extends AppCompatActivity {

    private FrameLayout mChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_created);

        initView();
        mChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileCreatedActivity.this, EnableFBActivity.class));
            }
        });
    }

    private void initView() {
        mChecked = findViewById(R.id.checked);
    }
}
