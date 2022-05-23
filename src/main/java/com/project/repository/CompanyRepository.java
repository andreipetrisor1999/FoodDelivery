package com.project.repository;

import com.project.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query
    List<Company> getListOfCompanies();
}
