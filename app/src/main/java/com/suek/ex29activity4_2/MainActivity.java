package com.suek.ex29activity4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
        //Ex28 예제의 SecondActivity 를 묵시적 인텐트로 실행
        Intent intent= new Intent();
        intent.setAction("인사담당자"); //즉, 디바이브에 설치된 모든 액티비티를 다 물어봄
        startActivity(intent);
    }
}
