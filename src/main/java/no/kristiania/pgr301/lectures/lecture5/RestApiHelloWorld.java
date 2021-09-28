package no.kristiania.pgr301.lectures.lecture5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiHelloWorld {
    @GetMapping(path = "/")
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping(path = "/newEndpoint")
    public String newEndpoint() {
        return "When this code is pushed, Github Actions connects to "
                + "AWS Elastic Container Registry and builds the docker container";
    }
}
