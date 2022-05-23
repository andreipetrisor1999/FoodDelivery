package com.project.controller;

import com.project.model.Company;
import com.project.model.Menu;
import com.project.repository.CompanyRepository;
import com.project.service.CompanyService;
import com.project.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest-api/internal/menu")
public class MenuController {
    private MenuService menuService;

    @GetMapping("/byCompany/{id}")
    public ResponseEntity<Menu> getMenuByCompany(@PathVariable Long companyId) throws Exception {
        Menu companyMenu = null;
        try {
            companyMenu = menuService.getMenuByCompany(companyId);
        } catch (Exception e) {
            throw new Exception("A apărut o eroare!");
        }
        return ResponseEntity.ok(companyMenu);
    }
    }
