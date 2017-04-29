package com.work.service.impl;

import com.work.dao.api.VacancyDAO;
import com.work.dao.impl.VacancyDAOImpl;
import com.work.model.Vacancy;
import com.work.service.api.VacancyService;

import java.util.List;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class VacancyServiceImpl implements VacancyService {
    private final VacancyDAO vacancyDAO = new VacancyDAOImpl();

    public List<Vacancy> getVacancyListByKeyword(String keyword) {
        return vacancyDAO.getListByKeyword(keyword);
    }

    public List<Vacancy> getListOfVacancy() {
        return vacancyDAO.get();
    }

    public void saveVacancy(Vacancy vacancy) {
        vacancyDAO.save(vacancy);
    }

    public void delete(Vacancy vacancy) {
        vacancyDAO.delete(vacancy);
    }

}
