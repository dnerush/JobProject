package com.work.dao.impl;

import com.work.dao.api.EmployeeDAO;
import com.work.model.Employee;
import com.work.service.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sky_el on 16.03.2017.
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private final Connection connection;

    public static final String SQL_INSERT = "INSERT INTO mydb.employee(Account_idAccount, secondName, age, photoPath, country, " +
            " city, sex, name) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";

    public EmployeeDAOImpl() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"),
                    settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public List<Employee> get() {
        return null;
    }

    public void save(Employee employee) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getSecondName());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setString(4, employee.getPhotoPath());
            preparedStatement.setString(5, employee.getCountry());
            preparedStatement.setString(6, employee.getCity());
            preparedStatement.setString(7, employee.getSex());
            preparedStatement.setString(8, employee.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Employee update(Employee employee) {
        return null;
    }

    public Employee delete(Employee employee) {
        return null;
    }
}
