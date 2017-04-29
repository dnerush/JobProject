package com.work.dao.impl;

import com.work.dao.api.EmployeeDAO;
import com.work.model.Employee;
import com.work.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 16.03.2017.
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private final Connection connection;

    public static final String SQL_SELECT_ALL = "SELECT * FROM mydb.employee";
    public static final String SQL_SELECT_BY_ID = "SELECT * FROM mydb.employee WHERE Account_idAccount = ?";
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
        List<Employee> employeeList;
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(SQL_SELECT_ALL)) {
            employeeList = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return employeeList;
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

    public Employee getEmployeeByID(long id) {
        Employee foundEmployee = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);) {
            preparedStatement.setInt(1, (int)id);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs != null) {
                rs.next();
                foundEmployee = new Employee();
                foundEmployee.setId(rs.getInt("Account_idAccount"));
                foundEmployee.setName(rs.getString("name"));
                foundEmployee.setSecondName(rs.getString("secondName"));
                foundEmployee.setAge(rs.getInt("age"));
                foundEmployee.setPhotoPath(rs.getString("photoPath"));
                foundEmployee.setCountry(rs.getString("country"));
                foundEmployee.setCity(rs.getString("city"));
                foundEmployee.setSex(rs.getString("sex"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return foundEmployee;
    }

    private List<Employee> extractResultSet(ResultSet rs) throws SQLException {
        List<Employee> vacancyList = new ArrayList<>();
        Employee employee;
        while(rs.next()) {
            employee = new Employee();
            employee.setId(rs.getLong("Account_idAccount"));
            employee.setName(rs.getString("name"));
            employee.setSecondName(rs.getString("secondName"));
            employee.setAge(rs.getInt("age"));
            employee.setSex(rs.getString("sex"));
            employee.setPhotoPath(rs.getString("photoPath"));
            employee.setCountry(rs.getString("country"));
            employee.setCity(rs.getString("city"));
            vacancyList.add(employee);
        }
        return vacancyList;
    }
}
