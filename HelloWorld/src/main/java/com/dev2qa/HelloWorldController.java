package com.dev2qa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(value="/helloWorld", method=RequestMethod.GET)
    public String helloWorld()
    {
        // The html file name is helloWorldPage.html.
        return "helloWorldPage";
    }
}