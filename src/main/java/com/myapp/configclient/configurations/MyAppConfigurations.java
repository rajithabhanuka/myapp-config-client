package com.myapp.configclient.configurations;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@RefreshScope
@Configuration
@ConfigurationProperties(value = "myapp.rabbitmq")
public class MyAppConfigurations {

    @NotNull(message = "myapp.rabbitmq.hosts cannot be null")
    private String hosts;

    @NotNull(message = "myapp.rabbitmq.port cannot be null")
    private String port;

    @NotNull(message = "myapp.rabbitmq.username cannot be null")
    private String username;

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
