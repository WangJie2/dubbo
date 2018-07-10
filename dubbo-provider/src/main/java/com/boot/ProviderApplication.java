package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
     /*   try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

/*
作者：Magogo
链接：https://www.jianshu.com/p/0837b48d1691
來源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。*/
