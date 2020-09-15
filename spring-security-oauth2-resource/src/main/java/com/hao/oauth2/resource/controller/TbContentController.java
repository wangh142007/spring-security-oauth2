package com.hao.oauth2.resource.controller;

import com.hao.oauth2.resource.domain.TbContent;
import com.hao.oauth2.resource.dto.ResponseResult;
import com.hao.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 16:08
 */
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    /**
     * 获取全部资源
     *
     * @return
     */
    @GetMapping("/")
    public ResponseResult<List<TbContent>> selectAll() {
        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.selectAll());
    }

}
