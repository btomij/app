package com.joelin.userapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.joelin.userapp.Util.ScrimUtil;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
            View bottom = findViewById(R.id.rlay_main);
            bottom.setBackground(
                    ScrimUtil.makeCubicGradientScrimDrawable(
                            getResources().getColor(R.color.colorPrimaryDark), //顏色
                            8, //漸層數
                            Gravity.BOTTOM)); //起始方向
        }
    }
}
