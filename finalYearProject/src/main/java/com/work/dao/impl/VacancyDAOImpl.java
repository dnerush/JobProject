package com.work.dao.impl;

import com.work.dao.api.VacancyDAO;
import com.work.model.Vacancy;
import com.work.service.Settings;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class VacancyDAOImpl implements VacancyDAO {

    private final Connection connection;

    private static final String SQL_SELECT_ALL = "SELECT * FROM mydb.vacancy";
    private static final String SQL_SELECT_BY_KEYWORD = "SELECT * FROM mydb.vacancy WHERE name LIKE ?";
    private static final String SQL_INSERT = "INSERT INTO mydb.vacancy(name, type, description, sourceLink) " +
            "VALUES (?, ?, ?, ?) ";
    private static final String SQL_DELETE = "DELETE FROM mydb.vacancy WHERE idvacancy = ?";


    public VacancyDAOImpl() {
        final Settings settings = Settings.getInstance();
        try {
            this.connection = DriverManager.getConnection(settings.value("jdbc.url"),
                    settings.value("jdbc.username"), settings.value("jdbc.password"));
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public List<Vacancy> get() {
        List<Vacancy> vacancyList;
        try (Statement statement = connection.createStatement();
              ResultSet rs = statement.executeQuery(SQL_SELECT_ALL)) {
            vacancyList = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return vacancyList;
    }

    // получаем список вакансии по ключевому слову
    public List<Vacancy> getListByKeyword(String keyword) {
        List<Vacancy> vacancyList;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_BY_KEYWORD);) {
            preparedStatement.setString(1, "%" + keyword + "%");
            ResultSet rs = preparedStatement.executeQuery();
            vacancyList = extractResultSet(rs);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return vacancyList;
    }

    @Override
    public void save(Vacancy vacancy) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setString(1, vacancy.getName());
            preparedStatement.setString(2, vacancy.getType());
            preparedStatement.setString(3, vacancy.getDescription());
            preparedStatement.setString(4, vacancy.getSourceLink());
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

    private List<Vacancy> extractResultSet(ResultSet rs) throws SQLException {
        List<Vacancy> vacancyList = new ArrayList<>();
        Vacancy vacancy;
        while(rs.next()) {
            vacancy = new Vacancy();
            vacancy.setId(rs.getInt("idvacancy"));
            vacancy.setName(rs.getString("name"));
            vacancy.setType(rs.getString("type"));
            vacancy.setDescription(rs.getString("description"));
            vacancy.setSourceLink(rs.getString("sourceLink"));
            int isFavorite = rs.getInt("isFavorite");
            vacancy.setFavourite(!(isFavorite == 0));
            vacancyList.add(vacancy);
        }
        return vacancyList;
    }

    public void close() {
        try {
            if(connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
