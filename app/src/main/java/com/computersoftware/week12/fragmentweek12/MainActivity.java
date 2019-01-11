package com.computersoftware.week12.fragmentweek12;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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

    @Override
    public void onBackPressed() {
        int frgNumber = manager.getBackStackEntryCount();

        if(frgNumber > 1){
            manager.popBackStack();
        }else {
            AlertDialog.Builder builder
                    = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("คุณต้องการออกจากแอพหรือไม่");
            builder.setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    finish();
                }
            });

            builder.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    dialog.dismiss();
                }
            });
            builder.show();
        }

        Toast.makeText(this, ""+frgNumber, Toast.LENGTH_SHORT).show();

    }
}
