package com.myapp.configclient.controller;

import com.myapp.configclient.configurations.MyAppConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigServer {

    @Autowired
    MyAppConfigurations myAppConfigurations;


    @RequestMapping("hello/loadconfigs")
    public String loadConfigsFromServer() {

        return "host is :" + myAppConfigurations.getHosts() + " port is :" + myAppConfigurations.getPort() + " user is :" + myAppConfigurations.getUsername();
    }


}
