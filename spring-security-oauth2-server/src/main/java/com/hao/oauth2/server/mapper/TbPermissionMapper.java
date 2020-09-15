package com.hao.oauth2.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hao.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author     ：Wang Hao
 * @date       ：Created in 2020/9/15 11:47
 */
public interface TbPermissionMapper extends BaseMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);

}