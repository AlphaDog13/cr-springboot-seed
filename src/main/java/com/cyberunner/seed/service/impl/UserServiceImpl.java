package com.cyberunner.seed.service.impl;

import com.cyberunner.seed.dao.UserMapper;
import com.cyberunner.seed.model.User;
import com.cyberunner.seed.service.UserService;
import com.cyberunner.seed.common.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Created by CodeGenerator on 2018/08/27.
*/
@Service
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Resource
    private UserMapper userMapper;

}
