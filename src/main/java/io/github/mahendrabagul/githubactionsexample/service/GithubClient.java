package io.github.mahendrabagul.githubactionsexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubClient {
    private final RestTemplate restTemplate;

    @Autowired
    public GithubClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callApi(String userName) {
        String GITHUB_URL = "https://api.github.com/users/{USER_NAME}";
        ResponseEntity<String> response =
                restTemplate.getForEntity(GITHUB_URL.replace("{USER_NAME}", userName), String.class);
        return response.getBody();
    }
}