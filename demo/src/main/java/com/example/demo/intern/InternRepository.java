package com.example.demo.intern;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InternRepository
        extends JpaRepository<Intern, Long> {

    @Query("SELECT i FROM Intern i WHERE i.email = ?1")
    Optional<Intern> findInternByEmail(String email);
}
