package com.hao.oauth2.server.config.TbUserService;

import com.hao.oauth2.server.domain.TbUser;
import com.hao.oauth2.server.mapper.TbUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author     ：Wang Hao
 * @date       ：Created in 2020/9/15 11:54
 */
@Service
public class TbUserService extends ServiceImpl<TbUserMapper, TbUser> {

}
