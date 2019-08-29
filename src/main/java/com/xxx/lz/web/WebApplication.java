package com.xxx.lz.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(

        exclude = {

        }

)
@EnableScheduling
@MapperScan(basePackages = {"com.xxx.lz.web.dal.dao"})
@EnableTransactionManagement
public class WebApplication  extends WebMvcConfigurerAdapter  {





    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
        registry.addResourceHandler("/zongzi/**").addResourceLocations("classpath:/zongzi/");
        registry.addResourceHandler("/other/**").addResourceLocations("classpath:/other/");
        super.addResourceHandlers(registry);
    }
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
