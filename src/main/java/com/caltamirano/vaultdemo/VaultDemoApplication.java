package com.caltamirano.vaultdemo;

import com.caltamirano.vaultdemo.config.PropertiesConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PropertiesConfig.class)
public class VaultDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(VaultDemoApplication.class, args);
    }

    private  PropertiesConfig propertiesConfig;


    public VaultDemoApplication(PropertiesConfig propertiesConfig) {
        this.propertiesConfig = propertiesConfig;
    }

    @Override
    public void run(String... args) throws Exception {

        Logger logger = LoggerFactory.getLogger(VaultDemoApplication.class);

        logger.info("----------------------------------------");
        logger.info("Configuration properties");
        logger.info("   kronos.username is {}", propertiesConfig.getUsername());
        logger.info("   kronos.password is {}", propertiesConfig.getPassword());
        logger.info("----------------------------------------");



    }
}
