package com.example.createactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

//  라이프 사이클 확인
public class MainActivity extends AppCompatActivity {
    //  로그 출력을 위한 TAG 설정
    private final String TAG = MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  액티비티 초기화
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //  activity_main.xml 레이아웃을 불러와서 객체화 -> 화면으로 사용

        //  버튼 객체 찾기
        //  layout activity_main 내에 id가 btnNewActivity인 컨트롤을 참조
        View btnNewActivity = findViewById(R.id.btnNewActivity);   //  레이아웃 내에서 id를 이용해서 위젯을 선택
        //  Click Event Listener 연결
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            //  이벤트 처리기 함수 Override
            @Override
            public void onClick(View v) {
                //  Toast 띄우기
                Toast.makeText(MainActivity.this,   //  Context
                        "새 액티비티를 호출합니다.",   //  메시지
                        Toast.LENGTH_LONG)  //  지속 시간
                        .show();            //  토스트 띄우기

                //  새 액티비티를 띄워주기
                //  컴포넌트간 데이터 전송을 위해서는 Intent 필요
                //  명시적 인텐트 : 호출하고자 하는 Activit를 직접 명시한다
                Intent intent = new Intent(MainActivity.this,
                        NewActivity.class); //  호출하고자 하는 액티비티 클래스 명시
                //  안드로이드에게 우리의 의도 전송
                startActivity(intent);
            }
        });

        Log.d(TAG, "[LifeCycle] onCreate() call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "[LifeCycle] onStart() call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "[LifeCycle] onStop() call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[LifeCycle] onDestroy() call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "[LifeCycle] onPause() call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "[LifeCycle] onResume() call");
    }
}