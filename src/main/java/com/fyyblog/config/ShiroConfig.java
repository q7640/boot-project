package com.fyyblog.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @discription f3
 * @author: Dong
 * @vision 1.0
 * @since 2022/1/2123:27
 */
@Configuration
public class ShiroConfig {
    //3. 连接前端  ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        /* 添加Shiro的内置过滤器
            anon: 无需认证就可以访问
            authc: 必须认证了才能访问
            user:  必须拥有我 记住我 功能才能访问
            perms: 拥有对莫个资源的权限才能访问
            role:  拥有莫个角色权限才能访问
         */
        LinkedHashMap<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/user/add", "perms[user:add]");//user,的add anon设置所有人可以访问
        filterMap.put("/user/update", "perms[user:update]");//user,的update authc设置认证了才能访问

        bean.setFilterChainDefinitionMap(filterMap);
        bean.setLoginUrl("/tologin");
        bean.setUnauthorizedUrl("/noauth");
        return bean;
    }

    //2. 接管对象  DafaultWebSecurityManager
    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm") AccountRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联userReal   接管reaml对象
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    //1. 创建realm对象 、需要自定义
    @Bean
    public AccountRealm userRealm() {
        return new AccountRealm();
    }
}