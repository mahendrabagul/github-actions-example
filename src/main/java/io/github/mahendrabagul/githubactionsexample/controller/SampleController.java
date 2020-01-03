package io.github.mahendrabagul.githubactionsexample.controller;

import io.github.mahendrabagul.githubactionsexample.service.GithubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private final GithubClient githubClient;

    @Autowired
    public SampleController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/users/{userName}")
    public String fetchDetails(@PathVariable String userName) {
        return githubClient.callApi(userName);
    }
}