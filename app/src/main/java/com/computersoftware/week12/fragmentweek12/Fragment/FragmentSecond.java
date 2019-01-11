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

public class FragmentSecond extends Fragment {

    Button btn_back;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_layout,container,false);

            btn_back = view.findViewById(R.id.btn_back);
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    FragmentManager manager = getActivity().getSupportFragmentManager();
//                    manager.popBackStack();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.contentFrg,new FragmentFrist())
                            .addToBackStack(null).commit();
                }
            });

        return view;
    }
}
