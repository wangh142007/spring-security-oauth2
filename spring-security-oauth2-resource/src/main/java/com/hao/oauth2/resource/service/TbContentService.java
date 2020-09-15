package com.hao.oauth2.resource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hao.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author     ：Wang Hao
 * @date       ：Created in 2020/9/15 15:58
 */
@Service
public interface TbContentService extends IService<TbContent> {

    List<TbContent> selectAll();

}
