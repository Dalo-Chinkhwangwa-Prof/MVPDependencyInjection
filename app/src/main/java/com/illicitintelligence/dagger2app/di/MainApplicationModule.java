package com.illicitintelligence.dagger2app.di;

import com.illicitintelligence.dagger2app.network.GitRetrofit;
import com.illicitintelligence.dagger2app.presenter.Presenter;
import com.illicitintelligence.dagger2app.presenter.PresnterX;

import dagger.Module;
import dagger.Provides;

@Module
public class MainApplicationModule {

    @Provides
    public Presenter provideGitPresenter() {
        return new Presenter();
    }

    @Provides
    public PresnterX providePresenterx() {
        return new PresnterX();
    }

    @Provides
    public GitRetrofit providesGitRetrofit() {
        return new GitRetrofit();
    }

}
