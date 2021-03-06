package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.searchingCompanyByThreeFirstLetters",
                query = "SELECT * FROM companies WHERE SUBSTRING(COMPANY_NAME, 1, 3) = :COMPANYNAME",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.searchingCompanyByPart",
                query = "SELECT * FROM companies WHERE COMPANY_NAME LIKE :PARTNAME",
                resultClass = Company.class
        )
})

@Entity
@Table(name = "COMPANIES")
public class Company {
    private long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public long getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
