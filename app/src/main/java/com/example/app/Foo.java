package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.module1.Henson;

public class Foo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = com.example.module1.Henson.with(this)
                .gotoFoo()
                .cool("hello henson 3")
                .s("")
                .build();
        startActivity(intent);

        Intent intent2 = com.example.app.HensonNavigator
                .gotoFooNavigationModel(this)
                .cool("hello henson 3")
                .s("")
                .build();
        startActivity(intent2);

    }
}
