package com.ayaanle.binaryconverter_2;
import android.content.Intent;
import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeActivity.this , MainActivity.class);
                startActivity(i);
                finish();

            }
        } , 3000);

    }
}