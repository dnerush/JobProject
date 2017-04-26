package com.work.dao.api;

import com.work.model.Vacancy;

import java.util.List;

public interface VacancyDAO extends DAO<Vacancy> {
    List<Vacancy> getListByKeyword(String keyword);
}
