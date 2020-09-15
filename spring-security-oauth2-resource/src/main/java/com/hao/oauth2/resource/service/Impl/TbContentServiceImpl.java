package com.hao.oauth2.resource.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hao.oauth2.resource.domain.TbContent;
import com.hao.oauth2.resource.mapper.TbContentMapper;
import com.hao.oauth2.resource.service.TbContentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author     ：Wang Hao
 * @date       ：Created in 2020/9/15 15:58
 */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements TbContentService {

    @Override
    public List<TbContent> selectAll() {
        return this.baseMapper.selectList(new QueryWrapper<>());
    }
}
