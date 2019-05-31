package com.example.test;

public class MyProperties {
    private static MyProperties mInstance= null;

    public int someValueIWantToKeep;

    protected MyProperties(){}

    public static synchronized MyProperties getInstance() {
        if(null == mInstance){
            mInstance = new MyProperties();
        }
        return mInstance;
    }
}
