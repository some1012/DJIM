package com.newgenerate;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableSwagger2Doc
@SpringBootApplication
public class NewgenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewgenerateApplication.class, args);
    }

}
