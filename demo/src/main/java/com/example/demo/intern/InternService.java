package com.example.demo.intern;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void addNewIntern(Intern intern) {
        Optional<Intern> internByEmail = internRepository.findInternByEmail(intern.getEmail());
        if (internByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        internRepository.save(intern);
    }

    public void deleteIntern(Long internId) {
        boolean exists = internRepository.existsById(internId);
        if (!exists) {
            throw new IllegalStateException(
                    "intern with id " + internId + " does not exist");
        }
        internRepository.deleteById(internId);
    }

    @Transactional
    public void updateIntern(Long internId, String name, String email) {
        Intern intern = internRepository.findById(internId)
                .orElseThrow(() -> new IllegalStateException(
                        "intern with id " + internId + " does not exist"
                ));
        if (name != null &&
                !name.isEmpty() &&
                !Objects.equals(intern.getName(), name)) {
            intern.setName(name);
        }

        if (email != null &&
                !email.isEmpty() &&
                !Objects.equals((intern.getEmail()), email)) {
            Optional<Intern> internOptional = internRepository.findInternByEmail(email);
            if (internOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            intern.setEmail(email);
        }

    }
}
