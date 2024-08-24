package com.example.be.mapper;

import com.example.be.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Description: TODO
 **/

public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectUserPage(Page<User> page,String keyword);
}
