package io.github.mahendrabagul.controller;

import io.github.mahendrabagul.service.GithubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final GithubClient githubClient;

    @Autowired
    public ProfileController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/")
    public String fetchDetails() {
        return githubClient.callApi();
    }
}