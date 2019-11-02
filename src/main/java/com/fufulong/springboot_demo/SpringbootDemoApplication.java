package com.fufulong.springboot_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDemoApplication {
    @Value("${book.name}")
    private String bookname;
    @Value("${book.author}")
    private String bookauthor;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "book name is " + bookname + ",book author is " + bookauthor;

    }

}
