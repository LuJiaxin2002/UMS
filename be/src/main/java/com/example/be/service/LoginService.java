package com.example.be.service;

import com.example.be.dto.LoginDTO;
import com.example.be.result.Result;

/**
 * @Description:
 **/

public interface LoginService {
    public Result login(LoginDTO loginDTO);
}
