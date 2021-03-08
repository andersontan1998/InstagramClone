package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oF0JhTT2e7WQWrwSe1Dhdvrk9Y9gfZDfvQ6Py5o8")
                .clientKey("IzevZDO2m5H7Nc1dPGXhAJrEeuUeRzJuz0dm0nWT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
