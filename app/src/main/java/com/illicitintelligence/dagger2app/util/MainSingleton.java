package com.illicitintelligence.dagger2app.util;

import com.illicitintelligence.dagger2app.di.PresenterComponent;

public class MainSingleton {

    private static MainSingleton instance;

    private PresenterComponent presenterComponent;

    public PresenterComponent getPresenterComponent() {
        return presenterComponent;
    }

    public void setPresenterComponent(PresenterComponent presenterComponent) {
        this.presenterComponent = presenterComponent;
    }

    private MainSingleton(){}

    public static MainSingleton getInstance() {
        if(instance == null)
            instance = new MainSingleton();
        return instance;
    }

}
