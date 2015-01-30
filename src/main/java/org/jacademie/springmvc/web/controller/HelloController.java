package org.jacademie.springmvc.web.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.jacademie.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController implements Serializable {

    private static Logger LOGGER = Logger.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {

        LOGGER.info("Show hello-world page");

        return "hello-world";
    }
    
    @RequestMapping(value = "/bonjour", method = RequestMethod.GET)
    public String bonjourWorld() {

        return this.helloWorld();
    }


    @RequestMapping(value = "/helloName", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name, Model model) {

        LOGGER.info("Show hello with name: " + name);

        model.addAttribute("helloMessage", this.helloService.sayHello(name));

        return "hello";
    }
}
