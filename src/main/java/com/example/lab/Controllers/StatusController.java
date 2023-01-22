package com.example.lab.Controllers;


import com.example.lab.Services.StatusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }
    @GetMapping("/arrival")
    public String sayHello () {
        return "hello";
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return "goodbye";
    }
}
