package com.example.rahul.demo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4;
    SignUp sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button) findViewById(R.id.Singin);
        B2 = (Button) findViewById(R.id.Singup);
        B3 = (Button) findViewById(R.id.pre);
        B4 = (Button) findViewById(R.id.next);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn si = new SignIn();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragLoc, si);

                ft.commit();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp = new SignUp();
                // sp=new Fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragLoc, sp);
                // ft.add(headlines_fragment,sp);
                // ft.add(R.id.headlines_fragment,sp);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }
}
