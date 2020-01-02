package io.github.mahendrabagul.githubactionsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsExampleApplication {

    @GetMapping("/ping")
    public String sayHello() {
        return "Sample message from Gitlab Actions Example";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsExampleApplication.class, args);
    }
}
