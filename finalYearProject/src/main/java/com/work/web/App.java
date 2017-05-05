package com.work.web;

import com.work.service.impl.AccountServiceImpl;
import com.work.service.impl.EmployeeServiceImpl;
import com.work.service.impl.VacancyServiceImpl;

public class App {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AccountServiceImpl accountService = new AccountServiceImpl();
        VacancyServiceImpl vacancyService = new VacancyServiceImpl();

    }
}
