package com.test.demoq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author cy
 * @since 2020-11-16 19:52
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${spring.profiles.active}")
    private String profile;

    @Bean
    public Docket docket(Environment environment){

        //设置要显示swagger的环境
        Profiles of = Profiles.of(profile);
        //判断是否处于该环境
        boolean flag = environment.acceptsProfiles(of);

        /**
         * enable :配置是否启用Swagger，如果是false，在浏览器将无法访问
         * select()方法: 去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
         */
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("cy")
                .apiInfo(apiInfo())
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.demoq.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        Contact contact = new Contact("cy", "https://github.com/yumoyi", "1270472616@qq.com");

        return new ApiInfo("swagger学习", //标题
                "学习演示如何配置swagger", //描述
                "v1.0", //版本
                "https://github.com/yumoyi", //组织链接
                contact, //"联系人信息"
                "Apache2.0许可", //许可
                "许可链接", //许可链接
                new ArrayList<>());
    }

    //配置分组
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group1");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }
}
