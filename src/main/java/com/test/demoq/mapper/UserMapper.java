package com.test.demoq.mapper;

import com.test.demoq.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2020-11-16
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> selectOnse();
}
