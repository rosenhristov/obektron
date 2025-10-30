package com.obectron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "com.obectron.core",
        "com.obectron.db",
        "com.obectron.api",
        "com.obectron.common"
})
@EnableJpaRepositories(basePackages = {
        "com.obectron.db",
        "com.obectron.core"
})
@EntityScan(basePackages = "com.obectron.core")
public class Obectron {

    public static void main(String[] args) {
        SpringApplication.run(Obectron.class, args);
    }

}
