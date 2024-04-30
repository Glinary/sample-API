package com.example.demo.intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class InternService {

    private final InternRepository internRepository;

    @Autowired
    public InternService(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    public List<Intern> getInterns() {
        return internRepository.findAll();
    }
}
