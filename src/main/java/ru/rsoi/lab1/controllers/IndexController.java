package ru.rsoi.lab1.controllers;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import javax.servlet.http.HttpServletRequest;
 import javax.validation.constraints.NotNull;

@Controller
public class IndexController {


    @RequestMapping(value = "/", method={RequestMethod.GET})
    @ResponseBody
    public String hello(HttpServletRequest request, @RequestParam(value = "name", required = false) String name) {
        if (name==null||request == null)
            return "Hello world!";
        else
            return "Hello "+ request.getParameter("name")+"!";
    }

}