package com.illicitintelligence.dagger2app.di;


import com.illicitintelligence.dagger2app.presenter.Presenter;
import com.illicitintelligence.dagger2app.view.MainActivity;

import dagger.Component;

@Component(modules = {MainApplicationModule.class})
public interface PresenterComponent {
     void inject(MainActivity activity);
     void inject(Presenter presenter);
}
