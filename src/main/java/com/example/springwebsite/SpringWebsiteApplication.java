package com.example.springwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.FlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import static org.springframework.session.SaveMode.ALWAYS;

@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60, flushMode = FlushMode.IMMEDIATE, saveMode = ALWAYS)
@EnableWebSecurity
public class SpringWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebsiteApplication.class, args);
    }

}
