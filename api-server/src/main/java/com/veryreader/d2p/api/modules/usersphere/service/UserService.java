package com.veryreader.d2p.api.modules.usersphere.service;

import com.veryreader.d2p.api.modules.usersphere.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author auto generator
 * @since 2020-02-13
 */
public interface UserService extends IService<User> {

    List<Long> getUserRoleIds(Long userId);
}
