package com.example.demo.intern;

import java.time.LocalDate;

public class Intern {
    private Long id;
    private String name;
    private String email;
    private LocalDate startDate;
    private Integer daysOfWork;

    public Intern() {
    }

    public Intern(Long id, String name, String email, LocalDate startDate, Integer daysOfWork) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.startDate = startDate;
        this.daysOfWork = daysOfWork;
    }

    // Test to see database generating id instead
    public Intern(String name, String email, LocalDate startDate, Integer daysOfWork) {
        this.name = name;
        this.email = email;
        this.startDate = startDate;
        this.daysOfWork = daysOfWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(Integer daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", startDate=" + startDate +
                ", daysOfWork=" + daysOfWork +
                '}';
    }
}
