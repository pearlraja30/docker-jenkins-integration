package com.fss.onboarding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.fss.onboarding.controller") })
@EnableJpaRepositories("com.fss.onboarding.dao")
public class DemoMerchantApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoMerchantApplication.class, args);
    }
}
