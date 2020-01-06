package io.github.mahendrabagul.service;

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

    public String callApi() {
        String GITHUB_URL = "https://api.github.com/users/mahendrabagul";
        ResponseEntity<String> response =
                restTemplate.getForEntity(GITHUB_URL, String.class);
        return response.getBody();
    }
}