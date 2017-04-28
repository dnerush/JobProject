package com.work.dao.impl;

import com.work.dao.api.AccountDAO;
import com.work.model.Account;
import com.work.service.Settings;

import java.sql.*;
import java.util.List;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class AccountDAOImpl implements AccountDAO {

    private final Connection connection;

    public static final String SQL_INSERT = "INSERT INTO mydb.account(login, password, email, phone) VALUES (?, ?, ?, ?)";
    public static final String SQL_SELECT_ID = "SELECT * FROM mydb.account WHERE login = ? AND  password = ?";

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
        return null;
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
    public Account update(Account account) {
        return null;
    }

    @Override
    public Account delete(Account account) {
        return null;
    }

    @Override
    public long getAccountID(Account account) {
        long accountID;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ID)) {
            preparedStatement.setString(1, account.getLogin());
            preparedStatement.setString(2, account.getPassword());
            ResultSet rs = preparedStatement.executeQuery();
            accountID = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return accountID;
    }

    private long extractResultSet(ResultSet rs) throws SQLException {
        rs.next();
        return rs.getLong("idAccount");
    }


}
