package com.bawei.zhoukao3_b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/24/0024.
 */
public class Second extends Activity{


    private EditText name;
    private EditText pwd;
    private Button denglu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);


        name = (EditText) findViewById(R.id.second_name);
        pwd = (EditText) findViewById(R.id.second_pwd);
        denglu = (Button) findViewById(R.id.second_denglu);



        denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (name.getText().length()>5 && pwd.getText().length()>5){

                    Toast.makeText(Second.this, "登陆成功", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(Second.this, Three.class));

                }else {

                    Toast.makeText(Second.this, "请正确信息", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
