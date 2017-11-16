package com.example.module1;


import dart.BindExtra;
import dart.DartModel;

/*
TODO
 * make the NavigationModel prefix optional, in this case the DartModel value annotation is optional
 * rename DartModel to NavigationModel
 * make @NavigationModel optional if there is 1+ @BindExtra present
 * rename suffix of intent builders to __IntentBuilder
 * do we want to generate a FooModel__ActivityClassNameProvider when compiling Foo activity
 * so it would link dynamically the model and the class, but we would need to annotate the class
 * of the activity, not the model. It would be complicated for empty classes, a bit overkill...
 */
@DartModel("com.example.module1.Foo")
public class FooModel {
    @BindExtra String s;
}
