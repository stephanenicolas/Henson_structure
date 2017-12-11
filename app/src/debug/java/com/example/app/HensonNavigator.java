package com.example.app;
import android.content.Context;
import com.example.module1.Foo__IntentBuilder;
public class HensonNavigator {
public static Foo__IntentBuilder gotoFoo(Context context) {
  return new Foo__IntentBuilder(context);
}
}
