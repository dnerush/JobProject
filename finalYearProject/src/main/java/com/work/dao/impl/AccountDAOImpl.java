package com.work.dao.impl;

import com.work.dao.api.AccountDAO;
import com.work.model.Account;
import com.work.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class AccountDAOImpl implements AccountDAO {

    private final Connection connection;

    private static final String SQL_SELECT_ALL = "SELECT * FROM mydb.account";
    private static final String SQL_INSERT = "INSERT INTO mydb.account(login, password, email, phone) VALUES (?, ?, ?, ?)";
    private static final String SQL_SELECT_ID = "SELECT * FROM mydb.account WHERE login = ? AND  password = ?";
    private static final String SQL_DELETE = "DELETE FROM mydb.account WHERE idAccount = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM mydb.account WHERE idAccount = ?";

    public AccountDAOImpl() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"),
                    settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public List<Account> get() {
        List<Account> accountList;
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(SQL_SELECT_ALL)) {
            accountList = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return accountList;
    }

    @Override
    public void save(Account account) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setString(1, account.getLogin());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getPhone());
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

    @Override
    public int getAccountID(Account account) {
        int accountID;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ID)) {
            preparedStatement.setString(1, account.getLogin());
            preparedStatement.setString(2, account.getPassword());
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) accountID = rs.getInt("idAccount");
            else throw new SQLException();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return accountID;
    }

    @Override
    public Account getAccountByID(int id) {
        Account account = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            account = new Account();
            account.setId(rs.getInt("idAccount"));
            account.setLogin(rs.getString("login"));
            account.setPassword(rs.getString("password"));
            account.setEmail(rs.getString("email"));
            account.setPhone(rs.getString("phone"));

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return account;
    }

    private List<Account> extractResultSet(ResultSet rs) throws SQLException {
        List<Account> accountList = new ArrayList<>();
        Account account;
        while(rs.next()) {
            account = new Account();
            account.setId(rs.getInt("idAccount"));
            account.setLogin(rs.getString("login"));
            account.setPassword(rs.getString("password"));
            account.setEmail(rs.getString("email"));
            account.setPhone(rs.getString("phone"));
            accountList.add(account);
        }
        return accountList;
    }


}
