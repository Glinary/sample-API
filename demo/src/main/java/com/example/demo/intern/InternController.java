package com.example.demo.intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/intern")
public class InternController {

    private final InternService internService;

    @Autowired
    public InternController(InternService internService) {
        this.internService = internService;
    }

    @GetMapping
    public List<Intern> getInterns() {
        return internService.getInterns();
    }
}
