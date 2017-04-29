package com.work.dao.api;

import com.work.model.Employee;

public interface EmployeeDAO extends DAO<Employee> {
    Employee getEmployeeByID(long id);
}
