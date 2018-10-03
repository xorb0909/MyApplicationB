package com.example.xorb0.myapplicationb;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();

// 프래그먼트로 생명주기
        ExitDialogFragment exitDialogFragment = new ExitDialogFragment();


        exitDialogFragment.show(getSupportFragmentManager(), "종료창");





/*  기본 꺼지는거 예제
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("종료메세지");
        builder.setMessage("종료할꺼야?");

        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("취소", null);

        builder.show();
*/

    }
}
