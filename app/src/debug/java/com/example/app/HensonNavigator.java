package com.example.app;
import android.content.Context;
import com.example.module1.FooNavigationModel__IntentBuilder;
import com.example.module1.FooNavigationModel__IntentBuilder.RequiredSequence;
import com.example.module1.FooNavigationModel__IntentBuilder.ResolvedAllSet;
public class HensonNavigator {
  public static FooNavigationModel__IntentBuilder.RequiredSequence<FooNavigationModel__IntentBuilder.ResolvedAllSet> gotoFooNavigationModel(Context context) {
    return FooNavigationModel__IntentBuilder.getInitialState(context);
  }
}

