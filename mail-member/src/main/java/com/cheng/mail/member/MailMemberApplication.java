package com.cheng.mail.member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cheng.mail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MailMemberApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MailMemberApplication.class, args);
    }

}
