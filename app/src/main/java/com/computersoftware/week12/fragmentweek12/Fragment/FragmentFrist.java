package com.computersoftware.week12.fragmentweek12.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.computersoftware.week12.fragmentweek12.R;

public class FragmentFrist extends Fragment {

    Button btn_go_frg2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_layout,container,false);

        //bind widget
        btn_go_frg2 = view.findViewById(R.id.btn_frg2);

        btn_go_frg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.contentFrg,new FragmentSecond())
                        .addToBackStack(null)
                        .commit();

            }
        });


        return view;
    }
}
