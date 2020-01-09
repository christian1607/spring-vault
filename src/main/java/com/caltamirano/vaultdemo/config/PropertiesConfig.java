package com.caltamirano.vaultdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author christian altamirano
 * @date 1/9/20
 */

@ConfigurationProperties("kronos")
public class PropertiesConfig {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
