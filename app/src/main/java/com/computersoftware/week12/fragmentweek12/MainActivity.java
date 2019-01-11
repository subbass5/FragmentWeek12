package com.computersoftware.week12.fragmentweek12;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.computersoftware.week12.fragmentweek12.Fragment.FragmentFrist;
import com.computersoftware.week12.fragmentweek12.Fragment.FragmentSecond;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.contentFrg,new FragmentFrist()).addToBackStack(null).commit();

    }
}
