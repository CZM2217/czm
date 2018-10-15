package com.jnshu.carrots.homeservice.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {

    public static final String VERSION = "1.0";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jnshu.carrots.homeservice.controller"))
                .paths(PathSelectors.any())//可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("萝卜多接口文档")//设置文档的标题
                .description("更多Spring Boot相关文章请关注：http://localhost:8771/swagger-ui.html")//设置文档的描述->1.Overview
                .termsOfServiceUrl("http://blog.didispace.com/")//设置文档的License信息->1.3 License information
//                .contact("山竹小分队")//设置文档的联系方式->1.2 Contact information
                .version(VERSION)//设置文档的版本信息-> 1.1 Version information
                .build();
    }

}
