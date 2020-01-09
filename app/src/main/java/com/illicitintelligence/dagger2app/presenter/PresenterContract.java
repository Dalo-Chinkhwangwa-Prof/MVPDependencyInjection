package com.illicitintelligence.dagger2app.presenter;

import com.illicitintelligence.dagger2app.model.RepoResult;

import java.util.List;

public interface PresenterContract {

    interface GitPresenter {
        void getRepositories(String userName);
        void setView(GitView view);
    }

    interface GitView {
        void displayRepositories(List<RepoResult> resultList);
        void showError(String errorMessage);
    }

}
