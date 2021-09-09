package thoughtworks.rachael.server.controller;

import thoughtworks.rachael.server.config.FeignConfigClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RachaelController {

    FeignConfigClient feignConfigClient;

    public RachaelController(FeignConfigClient feignConfigClient) {
        this.feignConfigClient = feignConfigClient;
    }

    @GetMapping("/")
    public String index() {
        return "welcome to Rachael Server 01";
    }

    @GetMapping("/zuul")
    public String zuulIndex() {
        return "??"+feignConfigClient.zuulIndex();
    }
}
