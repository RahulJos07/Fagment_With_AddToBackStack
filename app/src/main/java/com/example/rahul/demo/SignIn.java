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

public class SignIn extends Fragment {
    Button B4;
    SignUp sp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container= (ViewGroup) inflater.inflate(R.layout.activity_sign_in, container, false);
        B4=(Button)container.findViewById(R.id.next);

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp=new SignUp();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragLoc,sp);
                ft.addToBackStack(null);
                //fm.popBackStack();
                ft.commit();
            }
        });
        return container;
    }
}
