package com.fyyblog;

/**
 * @discription controller
 * @author: Dong
 * @vision 1.0
 * @since 2022/1/2116:01
 */

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan("com.hnsd.xnfx_api_java.**.mapper")
@EnableSwagger2
public class FyyBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(FyyBlogApplication.class, args);
    }
}
