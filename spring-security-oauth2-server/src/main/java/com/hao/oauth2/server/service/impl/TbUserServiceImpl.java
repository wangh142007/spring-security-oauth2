package com.hao.oauth2.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hao.oauth2.server.domain.TbUser;
import com.hao.oauth2.server.mapper.TbUserMapper;
import com.hao.oauth2.server.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 11:55
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Override
    public TbUser getByUsername(String username) {
        return this.baseMapper.selectOne(new QueryWrapper<TbUser>().lambda().eq(TbUser::getUsername, username));
    }
}
