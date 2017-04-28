package com.work.dao.impl;

import com.work.dao.api.DAO;
import com.work.model.Company;
import com.work.service.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Sky_el on 23.03.2017.
 */
public class CompanyDAOImpl implements DAO<Company> {

    private final Connection connection;

    public static final String SQL_INSERT = "INSERT INTO mydb.company(Account_idAccount, name, type, description, logoPath, " +
            " country, city) VALUES (?, ?, ?, ?, ?, ?, ?) ";

    public CompanyDAOImpl() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"),
                    settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public List<Company> get() {
        return null;
    }

    @Override
    public void save(Company company) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setLong(1, company.getId());
            preparedStatement.setString(2, company.getName());
            preparedStatement.setString(3, company.getType());
            preparedStatement.setString(4, company.getDescription());
            preparedStatement.setString(5, company.getLogo());
            preparedStatement.setString(6, company.getCountry());
            preparedStatement.setString(7, company.getCity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Company update(Company company) {
        return null;
    }

    @Override
    public Company delete(Company company) {
        return null;
    }
}
