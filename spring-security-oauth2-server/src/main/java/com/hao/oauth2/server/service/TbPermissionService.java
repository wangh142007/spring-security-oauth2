package com.hao.oauth2.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hao.oauth2.server.domain.TbPermission;

import java.util.List;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 11:49
 */
public interface TbPermissionService extends IService<TbPermission> {

    List<TbPermission> selectByUserId(Long userId);
}
