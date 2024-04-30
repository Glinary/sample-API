package com.example.demo.intern;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class InternService {

    public List<Intern> getInterns() {
        return List.of(
                new Intern(1L,
                        "Gleezell",
                        "gleezell@gmail.com",
                        LocalDate.of(2024, Month.APRIL, 22),
                        5
                )
        );
    }
}
