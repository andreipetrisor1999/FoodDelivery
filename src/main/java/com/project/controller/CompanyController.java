package com.project.controller;

import com.project.model.Company;
import com.project.repository.CompanyRepository;
import com.project.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest-api/internal/company")
public class CompanyController {
    private CompanyService companyService;

    @GetMapping()
    public List<Company> getListOfCompanies() throws Exception {
        List<Company> listOfCompanies;
        try {
            listOfCompanies = null;
            listOfCompanies = companyService.getListOfCompanies();
        } catch (Exception e) {
            throw new Exception("A apărut o eroare!");
        }
        return (List<Company>) CompanyRepository.findAll();
    }

}
