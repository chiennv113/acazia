package com.example.acazia.LoginSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.acazia.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EnterPhoneNumberActivity extends AppCompatActivity {

    private ImageView mImgArrowback;
    private Spinner mSpinner2;
    private FloatingActionButton mBtnArrNext;
    private TextView mTvSignIn;
    private EditText mEdtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_number);
        initView();
        mImgArrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
//        mBtnArrNext.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));

        mBtnArrNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtPhoneNumber.getText().toString().trim().equals("")) {
                    Toast.makeText(EnterPhoneNumberActivity.this, "No data", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(EnterPhoneNumberActivity.this, EnterVerifyCodeActivity.class);
                    intent.putExtra("PhoneNumber", mEdtPhoneNumber.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });

        String[] arraySpinner = new String[]{
                "+1(Canada/Us)", "+7(Nga)", "+49(Đức)", "+44(Anh)", "+81(Nhật Bản)", "+82(Hàn Quốc)", "+86(Trung Quốc)", "+84(Việt Nam)"
        };
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.spiner_item, arraySpinner
        );
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spiner_item);
        mSpinner2.setAdapter(spinnerArrayAdapter);


    }

    private void initView() {
        mImgArrowback = findViewById(R.id.imgArrowback);
        mSpinner2 = findViewById(R.id.spinner2);
        mBtnArrNext = findViewById(R.id.btn_arr_next);
        mTvSignIn = findViewById(R.id.tvSignIn);
        mEdtPhoneNumber = findViewById(R.id.edtPhoneNumber);
    }
}
