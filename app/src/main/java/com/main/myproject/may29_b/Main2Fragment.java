package com.main.myproject.may29_b;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Activity Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_fragment);
    }

    @Override
    protected void onResume() {
        System.out.println("Activity Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("Activity Pause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        System.out.println("Activity Destroy");
        super.onDestroy();
    }

    public void AddFragment(View view){
        Fragment1 fragment1 = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.con_layout,fragment1).commit();
    }
}
