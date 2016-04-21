package com.dutytrail.service.template.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArchConfService {

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public String ping() {
        return "Service Template -> Alive \nConfig Profile: ";
    }

}
