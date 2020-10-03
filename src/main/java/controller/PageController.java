package controller;

import model.Scenario;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.ScenarioRepository;

@RestController
public class PageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage() {
        return "start";
    }

    @RequestMapping("/hello")
    public String pageTwo() {
        return "Hello Spring Boot!";
    }

    @Autowired
    public ScenarioRepository rep;

    @RequestMapping("/scenario")
    public String testMethod() {
        StringBuilder response = new StringBuilder();
        Scenario scenario = new Scenario();
        rep.save(scenario);
        for (Scenario i : rep.findAll()) {
            response.append(i).append("<br>");
        }
        return response.toString();
    }
}