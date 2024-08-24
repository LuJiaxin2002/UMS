package com.example.be.controller;

import com.example.be.dto.LoginDTO;
import com.example.be.result.Result;
import com.example.be.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 **/
@RestController()
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/api/login")
    public Result login(@RequestBody LoginDTO loginDTO){
      return loginService.login(loginDTO);
    }

    @PostMapping(value = "/api/hello")
    public Result hello(){
        return new Result(200,"hello","world");
    }
}
