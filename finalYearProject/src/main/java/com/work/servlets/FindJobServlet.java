package com.work.servlets;

import com.work.model.Vacancy;
import com.work.service.impl.VacancyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class FindJobServlet extends HttpServlet {

    private final VacancyServiceImpl service = new VacancyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        new MainPageServlet().initLoginOfAuthorizedUser(req);
        req.setAttribute("ourBaseChecked", true);
        req.setAttribute("outBaseChecked", false);
        req.setAttribute("keyword", "");
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("ourBaseChecked", req.getParameter("ourBase") != null);
        req.setAttribute("outBaseChecked", req.getParameter("outBase") != null);

        if(req.getParameter("ourBase") != null) {
            String keyword = req.getParameter("keyword");
            List<Vacancy> vacancyList = service.getVacancyListByKeyword(keyword);

            req.setAttribute("matches", vacancyList);
            req.setAttribute("keyword", keyword);
        }
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }
}

