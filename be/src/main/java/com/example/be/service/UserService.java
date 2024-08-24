package com.example.be.service;

import com.example.be.dto.QueryDTO;
import com.example.be.entity.User;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Description
 */
public interface UserService {

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    IPage<User> selectUserPage(QueryDTO queryDTO);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(Integer id);

    void batchDelete(List<Integer> ids);
}
