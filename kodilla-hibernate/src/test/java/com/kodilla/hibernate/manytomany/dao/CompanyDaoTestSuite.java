package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;
    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        long softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        long dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        long greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
    }

    @Test
    public void testNamedQueries() {
        //Given
        Employee js = new Employee("John", "Smith");
        Employee ac = new Employee("Amanda", "Cable");
        Employee gs = new Employee("George", "Stan");

        Company g = new Company("Google");
        Company f = new Company("Facebook");
        Company t = new Company("Twitter");

        g.getEmployees().add(js);
        f.getEmployees().add(ac);
        t.getEmployees().add(gs);

        js.getCompanies().add(g);
        ac.getCompanies().add(f);
        gs.getCompanies().add(t);

        employeeDao.save(js);
        employeeDao.save(ac);
        employeeDao.save(gs);

        companyDao.save(g);
        companyDao.save(f);
        companyDao.save(t);

        //When
        List<Employee> searchByName = employeeDao.searchingEmployeesByName("Smith");
        List<Company> firstCompanyLetters = companyDao.searchingCompanyByThreeFirstLetters("Fac");

        //Then
        Assert.assertEquals(1, searchByName.size());
        Assert.assertEquals(1, firstCompanyLetters.size());

        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}