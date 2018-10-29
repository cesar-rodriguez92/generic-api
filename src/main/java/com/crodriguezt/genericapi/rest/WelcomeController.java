package com.crodriguezt.genericapi.rest;

import com.crodriguezt.genericapi.common.RestPaths;
import com.crodriguezt.genericapi.model.entity.User;
import com.crodriguezt.genericapi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = RestPaths.WELCOME)
public class WelcomeController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = RestPaths.HOME, method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity home(HttpServletRequest request, @RequestBody User user){

        log.info("Ini " + request.getServletPath());
        ResponseEntity response =  new ResponseEntity("OK", HttpStatus.OK);
        userService.createUserService(user);
        return response;
    }
}
