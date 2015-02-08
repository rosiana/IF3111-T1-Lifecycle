package com.if3110.androidlifecycle;

/**
 * Created by Rosi on 08/02/2015.
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }



}
