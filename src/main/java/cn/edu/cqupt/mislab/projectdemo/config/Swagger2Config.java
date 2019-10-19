package cn.edu.cqupt.mislab.projectdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: ProjectDemo
 * @description: swagger配置
 * @author: 宋丽
 * @create: 2019-10-19 18:59
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value("${swagger2.enable}")
    private boolean enable;

    @Bean
    public Docket algorithmApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.edu.cqupt.mislab.projectdemo.controller"))
                .paths(PathSelectors.any())
                .build()
                .enable(enable)
                .useDefaultResponseMessages(false);
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("系统框架demo")
                .contact(new Contact("xxxx", "xxxx.github.io", "xxxx@xx.com"))
                .version("1.0")
                .build();

    }
}
