package com.illicitintelligence.dagger2app.presenter;

import com.illicitintelligence.dagger2app.model.RepoResult;
import com.illicitintelligence.dagger2app.network.GitRetrofit;
import com.illicitintelligence.dagger2app.util.MainLogger;
import com.illicitintelligence.dagger2app.util.MainSingleton;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Presenter implements PresenterContract.GitPresenter {

    private PresenterContract.GitView gitView;

    @Inject
    public GitRetrofit gitRetrofit;

    public Presenter() {
        MainSingleton
                .getInstance()
                .getPresenterComponent()
                .inject(this);
    }

    @Override
    public void getRepositories(String userName) {
        gitRetrofit
                .getRepositories(userName)
                .enqueue(new Callback<List<RepoResult>>() {
                    @Override
                    public void onResponse(Call<List<RepoResult>> call, Response<List<RepoResult>> response) {
                        if(response.body() != null)
                            gitView.displayRepositories(response.body());
                        else
                            gitView.showError("Empty List.");
                    }

                    @Override
                    public void onFailure(Call<List<RepoResult>> call, Throwable t) {
                        gitView.showError(t.getMessage());
                    }
                });
    }

    @Override
    public void setView(PresenterContract.GitView view) {
        MainLogger.logDebug("View has been set.. in presenter..");
        this.gitView = view;
    }
}
