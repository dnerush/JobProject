package com.work.web;

import com.work.model.Company;
import com.work.service.impl.CompanyServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CompanyServiceImpl companyService = new CompanyServiceImpl();
        List<Company> list =  companyService.companyList();

        System.out.println(list);

    }
}
