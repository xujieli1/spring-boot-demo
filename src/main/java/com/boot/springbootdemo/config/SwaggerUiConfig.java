package com.boot.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 启用swagger
 * @author : jieli.xu
 * @date : 2022/6/2
 */
@Component
public class SwaggerUiConfig {
    @Value(value = "${server.port}")
    private Integer serverPort;
    @Configuration
    @EnableSwagger2WebMvc
    public class Knife4jConfiguration {

        @Bean(value = "defaultApi2")
        public Docket defaultApi2() {
            Docket docket = new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(new ApiInfoBuilder()
                            //.title("swagger-bootstrap-ui-demo RESTful APIs")
                            .description("# swagger-bootstrap-ui-demo RESTful APIs")
                            .termsOfServiceUrl("http://localhost:"+serverPort+"/doc.html")
                            .contact("xx@qq.com")
                            .version("1.0")
                            .build())
                    //分组名称
                    .groupName("2.5.6版本")
                    .select()
                    //这里指定Controller扫描包路径
                    .apis(RequestHandlerSelectors.basePackage("com.boot.springbootdemo.controller"))
                    .paths(PathSelectors.any())
                    .build();
            return docket;
        }
    }
}
