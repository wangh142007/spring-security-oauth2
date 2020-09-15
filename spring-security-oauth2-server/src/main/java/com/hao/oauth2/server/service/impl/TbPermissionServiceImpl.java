package com.hao.oauth2.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hao.oauth2.server.domain.TbPermission;
import com.hao.oauth2.server.mapper.TbPermissionMapper;
import com.hao.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 11:49
 */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements TbPermissionService {

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return this.baseMapper.selectByUserId(userId);
    }
}
