package com.fyyblog.config;

import entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @discription ww
 * @author: Dong
 * @vision 1.0
 * @since 2022/1/2123:27
 */
public class AccountRealm extends AuthorizingRealm {
    @Autowired
    private service.IUserService userService;
    //。1 自定义的Realm
    @Override//授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权===》doGetAuthorizationInfo");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //拿到当前登陆的对象
        Subject subject = SecurityUtils.getSubject();
        //拿到account对象
        entity.User currentUser = (User) subject.getPrincipal();
        //设置当前用户权限
        info.addStringPermission(currentUser.getParentId());
        return info;
    }

    @Override//认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证===》doGetAuthenticationInfo");
        //连接数据库
        UsernamePasswordToken Token = (UsernamePasswordToken) authenticationToken;
        entity.User user = userService.queryUserByName(Token.getUsername());
        if (user != null) {
            return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        }
        return null;
    }
}