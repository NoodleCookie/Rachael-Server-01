package thoughtworks.rachael.server.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("Rachael-Zuul")
public interface FeignConfigClient {

    @GetMapping("/")
    String zuulIndex();
}
