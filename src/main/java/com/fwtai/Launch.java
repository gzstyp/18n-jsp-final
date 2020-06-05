package com.fwtai;

import com.fwtai.config.LocaleLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@SpringBootApplication
@Configuration
public class Launch{

    public static void main(String[] args){
        SpringApplication.run(Launch.class,args);
    }

    /** 注册自定义的LocaleResolver*/
    @Bean
    public LocaleResolver localeResolver(){
        return new LocaleLanguage();
    }
}