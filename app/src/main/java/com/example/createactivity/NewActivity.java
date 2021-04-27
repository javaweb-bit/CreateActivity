package com.example.createactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //  버튼 연결
        View btnFinish = findViewById(R.id.btnFinish);
        //  이벤트 리스너 연결
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  명시적으로 액티비티 종료하고자 한다면 finish()
                finish();
            }
        });
    }
}