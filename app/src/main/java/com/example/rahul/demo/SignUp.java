package com.example.rahul.demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SignUp extends Fragment {
    Button B3,B4;
    SignUp sp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container= (ViewGroup) inflater.inflate(R.layout.activity_sign_up, container, false);
        B3=(Button)container.findViewById(R.id.pre);
        B4=(Button)container.findViewById(R.id.home);

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn si= new SignIn();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragLoc,si);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return container;
    }
}
