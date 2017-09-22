package com.shinhan.servermoni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 리스트화면으로 이동!!  => 화면 전환 => Intent
        // 자기 자신 this로 표현해도되지만, 구체적으로 MainActivity.this 표기함)
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
        // 앱종료
        //finish();
    }
}
