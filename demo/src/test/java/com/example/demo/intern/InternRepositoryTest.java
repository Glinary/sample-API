package com.example.demo.intern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InternRepositoryTest {

    @Autowired
    private InternRepository underTest;

    @Test
    void itShouldFindInternByEmail() {
        //given
        boolean internExists = false;
        String email = "uy@gmail.com";
        Intern intern = new Intern(
                "Uy",
                "uy@gmail.com",
                LocalDate.of(2024, Month.APRIL, 22)
        );
        underTest.save(intern); //NOTE: this creates a new intern
        System.out.println(intern);
        //when
        Optional<Intern> internOptional = underTest.findInternByEmail(email);
        if (internOptional.isPresent()) {
            internExists = true;
        }

        //then
        assertThat(internExists).isTrue();
    }
}