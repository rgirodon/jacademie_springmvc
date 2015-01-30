package org.jacademie.springmvc.web.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.jacademie.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController implements Serializable {

	private static Logger LOGGER = Logger.getLogger(RegisterController.class);
	
    @ModelAttribute("user")
    public User getUser() {
        return new User();
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() {
        LOGGER.info("Show register page" );

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView submitForm(@ModelAttribute(value="user") User user) {

        LOGGER.info("registered user:" + user.toString());

        return new ModelAndView("user-registered", "user", user);
    }
}
