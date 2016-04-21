package com.dutytrail.service.template.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTemplateService {

//    @Value("${ping.alive}")
//    private String configPingAlive;

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public String ping() {
//        return "Service Template -> Alive \nConfig Profile: "+this.configPingAlive;
        return "Service Template -> Alive \nConfig Profile: ";
    }

}
