package com.fufulong.springboot_demo.configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/configurationProperties")
public class ConfigurationPropertiesController {
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(){
        return authorSettings.getName() +"," +authorSettings.getAge();
    }

}
