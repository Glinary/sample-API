package com.example.demo.intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void addNewIntern(@RequestBody Intern intern) {
        internService.addNewIntern(intern);
    }

    @DeleteMapping(path = "{internId}")
    public void deleteIntern(@PathVariable("internId") Long internId) {
        internService.deleteIntern(internId);
    }
}
