package com.hao.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 15:50
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hao.oauth2.resource.mapper")
public class OAuth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class, args);
    }

}
