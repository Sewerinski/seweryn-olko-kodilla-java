package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Finder {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Finder.class);

    public List<Company> findCompany(final String companyName) {
        try {
            LOGGER.info("Start searching companies...");
            return companyDao.searchingCompanyByPart(companyName);
        } catch (Exception e) {
            LOGGER.error("Error!" + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> findEmployee(final String employeeName) {
        try {
            LOGGER.info("Start searching employees...");
            return employeeDao.searchingEmployeesByPart(employeeName);
        } catch (Exception e) {
            LOGGER.error("Error!" + e.getMessage());
            return new ArrayList<>();
        }
    }
}