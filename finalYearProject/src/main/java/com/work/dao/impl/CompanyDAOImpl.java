package com.work.dao.impl;

import com.work.dao.api.CompanyDAO;
import com.work.model.Company;
import com.work.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 23.03.2017.
 */
public class CompanyDAOImpl implements CompanyDAO {

    private final Connection connection;

    private static final String SQL_SELECT_ALL = "SELECT * FROM mydb.company";
    private static final String SQL_INSERT = "INSERT INTO mydb.company(Account_idAccount, name, type, description, logoPath, " +
            " country, city) VALUES (?, ?, ?, ?, ?, ?, ?) ";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM mydb.company WHERE Account_idAccount = ?";
    private static final String SQL_DELETE = "DELETE FROM mydb.company WHERE Account_idAccount = ?";

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
    public void update(int id) {

    }

    @Override
    public void delete(int id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Company getCompanyByID(long id) {
        Company foundCompany = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_ID);) {
            preparedStatement.setInt(1, (int)id);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) {
                foundCompany = new Company();
                foundCompany.setId(rs.getInt("Account_idAccount"));
                foundCompany.setName(rs.getString("name"));
                foundCompany.setType(rs.getString("type"));
                foundCompany.setDescription(rs.getString("description"));
                foundCompany.setLogo(rs.getString("logoPath"));
                foundCompany.setCountry(rs.getString("country"));
                foundCompany.setCity(rs.getString("city"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return foundCompany;
    }

    private List<Company> extractResultSet(ResultSet rs) throws SQLException {
        List<Company> companyList = new ArrayList<>();
        Company company;
        while(rs.next()) {
            company = new Company();
            company.setId(rs.getInt("Account_idAccount"));
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
