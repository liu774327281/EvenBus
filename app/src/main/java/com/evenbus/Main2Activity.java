package com.evenbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class Main2Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void dianji(View view){
        EventBus.getDefault().post(
                new FirstEvent("FirstEvent btn clicked"));
    }
}
