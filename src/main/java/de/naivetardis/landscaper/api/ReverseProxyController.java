package de.naivetardis.landscaper.api;

import de.naivetardis.landscaper.service.ReverseProxyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@AllArgsConstructor
public class ReverseProxyController {

    private ReverseProxyService proxyService;

    @RequestMapping("/**")
    public ResponseEntity<String> reverseProxy(@RequestBody(required = false) String body,
                                                   HttpMethod method, HttpServletRequest request, HttpServletResponse response) {
        return proxyService.handleRequest()
    }

    @RequestMapping("/authenticate")
    public ResponseEntity<String>

}
