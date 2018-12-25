package ru.ankoks.Feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: ankoks
 * Date: 25.12.2018
 */
@FeignClient("rest-app")
public interface RestClient {

    @RequestMapping("/version")
    String getVersion();
}
