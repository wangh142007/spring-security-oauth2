package com.hao.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hao.oauth2.server.domain.TbUser;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 11:55
 */
public interface TbUserService extends IService<TbUser> {

    TbUser getByUsername(String username);

}
