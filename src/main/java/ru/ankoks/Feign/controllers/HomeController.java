package ru.ankoks.Feign.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ankoks.Feign.clients.RestClient;

/**
 * User: ankoks
 * Date: 25.12.2018
 */
@RestController
public class HomeController {

    private final RestClient restClient;

    @Autowired
    public HomeController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/rest-version")
    public String getVersion() {
        return restClient.getVersion();
    }
}
