package com.illicitintelligence.dagger2app.application;

import android.app.Application;

import com.illicitintelligence.dagger2app.di.DaggerPresenterComponent;
import com.illicitintelligence.dagger2app.di.PresenterComponent;
import com.illicitintelligence.dagger2app.util.MainLogger;
import com.illicitintelligence.dagger2app.util.MainSingleton;

public class GitApplication extends Application {


    private PresenterComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        MainLogger.logDebug("Application on create.");

        component = DaggerPresenterComponent
                .create();

        MainSingleton.getInstance().setPresenterComponent(component);
    }
}
