package com.hao.oauth2.server.config.service;

import com.hao.oauth2.server.domain.TbPermission;
import com.hao.oauth2.server.domain.TbUser;
import com.hao.oauth2.server.service.TbPermissionService;
import com.hao.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/9/15 12:03
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null){
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }

        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
