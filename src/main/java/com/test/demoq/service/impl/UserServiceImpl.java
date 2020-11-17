package com.test.demoq.service.impl;

import com.test.demoq.entity.User;
import com.test.demoq.mapper.UserMapper;
import com.test.demoq.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cy
 * @since 2020-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
