package com.illicitintelligence.dagger2app.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.illicitintelligence.dagger2app.R;
import com.illicitintelligence.dagger2app.model.RepoResult;
import com.illicitintelligence.dagger2app.presenter.Presenter;
import com.illicitintelligence.dagger2app.presenter.PresenterContract;
import com.illicitintelligence.dagger2app.presenter.PresnterX;
import com.illicitintelligence.dagger2app.util.MainLogger;
import com.illicitintelligence.dagger2app.util.MainSingleton;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements PresenterContract.GitView {

    @Inject
    public Presenter presenter;

    @Inject
    public PresnterX presnterX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainSingleton
                .getInstance()
                .getPresenterComponent()
                .inject(this);

        presenter.setView(this);
        presenter.getRepositories("Dalo-Chinkhwangwa-Prof");

    }

    @Override
    public void displayRepositories(List<RepoResult> resultList) {

        MainLogger.logDebug(getString(R.string.results_in, resultList.size()));
    }

    @Override
    public void showError(String errorMessage) {

    }
}
