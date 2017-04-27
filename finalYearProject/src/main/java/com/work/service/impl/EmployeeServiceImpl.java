package com.work.service.impl;

import com.work.dao.api.DAO;
import com.work.dao.impl.EmployeeDAOImpl;
import com.work.dto.AccountDTO;
import com.work.dto.EmployeeDTO;
import com.work.model.Account;
import com.work.model.Employee;
import com.work.service.api.AccountService;
import com.work.service.api.EmployeeService;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private DAO emplyeeDAO = new EmployeeDAOImpl();

    private AccountService accountService = new AccountServiceImpl();

    public void registrationEmployee(EmployeeDTO employeeDTO) {
        // validation
        if(!employeeDTO.getPassword2().equals(employeeDTO.getPassword2()))
            throw new IllegalArgumentException();


        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setLogin(employeeDTO.getLogin());
        accountDTO.setPassword1(employeeDTO.getPassword1());
        accountDTO.setPassword2(employeeDTO.getPassword2());
        accountDTO.setEmail(employeeDTO.getEmail());
        accountDTO.setPhone(employeeDTO.getPhone());
        Account account = accountService.registerAccount(accountDTO);

        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSecondName(employeeDTO.getSecondName());
        employee.setAge(employeeDTO.getAge());
        employee.setSex(employeeDTO.getSex());
        employee.setPhotoPath(employeeDTO.getPhotoPath());
        employee.setCountry(employeeDTO.getCountry());
        employee.setCity(employeeDTO.getCity());
        employee.setId(account.getId());
        emplyeeDAO.save(employee);
    }
}
