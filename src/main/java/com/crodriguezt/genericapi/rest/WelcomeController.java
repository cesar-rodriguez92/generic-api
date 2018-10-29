package com.crodriguezt.genericapi.rest;

import com.crodriguezt.genericapi.common.RestPaths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = RestPaths.WELCOME)
public class WelcomeController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = RestPaths.HOME, method = RequestMethod.GET)
    public ResponseEntity home(HttpServletRequest request){

        log.info("Ini " + request.getServletPath());
        ResponseEntity response =  new ResponseEntity("OK", HttpStatus.OK);
        return response;
    }
}
