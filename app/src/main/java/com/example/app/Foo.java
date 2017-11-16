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

        Intent intent = Henson.with(this)
                .gotoFoo()
                .s("hello henson 3")
                .build();
        startActivity(intent);
    }
}
