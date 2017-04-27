package com.work.servlets;

import com.work.dto.EmployeeDTO;
import com.work.model.Vacancy;
import com.work.service.impl.VacancyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class FindJobServlet extends HttpServlet {

    private final AtomicInteger ids = new AtomicInteger();

    private VacancyServiceImpl service = new VacancyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("keyword", "");
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName("Dmitriy");
        employeeDTO.setSecondName("Nerush");
        employeeDTO.setCity("Kharkov");
        employeeDTO.setEmail("2008Nerush2008@ukr.net");
        employeeDTO.setLogin("nerush");
        employeeDTO.setPassword1("123");
        employeeDTO.setPassword2("123");

        HttpSession session = req.getSession();
        session.setAttribute("user_session", employeeDTO);

        String keyword = req.getParameter("keyword");
        List<Vacancy> vacancyList = service.getVacancyListByKeyword(keyword);

        req.setAttribute("matches", vacancyList);
        req.setAttribute("keyword", keyword);
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }
}

