package com.example.module1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dart.Dart;

public class Foo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FooModel fooModel = new FooModel();

        Dart.bind(fooModel, this);
        setTitle("Foo");
    }
}
