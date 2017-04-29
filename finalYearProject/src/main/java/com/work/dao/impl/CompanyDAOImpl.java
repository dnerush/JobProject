package com.work.dao.impl;

import com.work.dao.api.DAO;
import com.work.model.Company;
import com.work.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 23.03.2017.
 */
public class CompanyDAOImpl implements DAO<Company> {

    private final Connection connection;

    public static final String SQL_SELECT_ALL = "SELECT * FROM mydb.company";
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
        List<Company> companyList;
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(SQL_SELECT_ALL)) {
            companyList = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return companyList;
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

    private List<Company> extractResultSet(ResultSet rs) throws SQLException {
        List<Company> companyList = new ArrayList<>();
        Company company;
        while(rs.next()) {
            company = new Company();
            company.setId(rs.getLong("Account_idAccount"));
            company.setName(rs.getString("name"));
            company.setType(rs.getString("type"));
            company.setDescription(rs.getString("description"));
            company.setLogo(rs.getString("logoPath"));
            company.setCountry(rs.getString("country"));
            company.setCity(rs.getString("city"));
            companyList.add(company);
        }
        return companyList;
    }
}
