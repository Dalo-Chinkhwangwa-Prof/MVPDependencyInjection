package com.illicitintelligence.dagger2app.network;

import com.illicitintelligence.dagger2app.model.RepoResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitService {

    @GET("/users/{userName}/repos")
    Call<List<RepoResult>> getRepos(
            @Path("userName") String gitUserName);

}
