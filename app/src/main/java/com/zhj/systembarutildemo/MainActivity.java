package com.zhj.systembarutildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_img = (Button) findViewById(R.id.bt_img);
        Button bt_bar = (Button) findViewById(R.id.bt_bar);
        bt_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,TopImgActivity.class);
                startActivity(intent);
            }
        });
        bt_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TopBarActivity.class);
                startActivity(intent);
            }
        });
    }
}
