package com.project.service;

import com.project.model.Company;
import com.project.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    public List<Company> getListOfCompanies() {
        return CompanyRepository.findAll();
    }
}
