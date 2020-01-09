package com.illicitintelligence.dagger2app.network;

import com.illicitintelligence.dagger2app.model.RepoResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitRetrofit {

    private static final String BASE_URL = "https://api.github.com";
    private GitService gitService;

    public GitRetrofit() {
        gitService = createGitService(getInstance());
    }

    private Retrofit getInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(getGSONFactory())
                .build();
    }

    private GsonConverterFactory getGSONFactory() {
        return GsonConverterFactory.create();
    }

    private GitService createGitService(Retrofit retrofit) {
        return retrofit.create(GitService.class);
    }

    public Call<List<RepoResult>> getRepositories(String userName) {
        return gitService.getRepos(userName);
    }

}
