package com.bawei.zhoukao3_b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private TextView main_textView;
    private Timer timer;
    private TimerTask timerTask;
    int time = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main_textView = (TextView) findViewById(R.id.main_TextView);


        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {

               runOnUiThread(new Runnable() {
                   @Override
                   public void run() {


                   if(time>0){


                       time--;
                       main_textView.setText("我在学习Android");
                   }else{

                       timer.cancel();
                       startActivity(new Intent(MainActivity.this, Second.class));

           }

                   }
               });

            }
        };

        timer.schedule(timerTask, 2000, 2000);

    }
}
