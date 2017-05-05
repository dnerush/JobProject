package com.work.servlets;

import com.work.Addition.FoundVacancy;
import com.work.Addition.Parser;
import com.work.model.Vacancy;
import com.work.service.impl.VacancyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class FindJobServlet extends HttpServlet {

    private final VacancyServiceImpl service = new VacancyServiceImpl();

    private final Parser parser = new Parser();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isGlobal", false);
        req.setAttribute("keyword", "");
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String keyword = req.getParameter("keyword");

        // сохраняем введенной пользователем ключевое слово, чтоб мы могли отобразить его в том же поле про redirect'e
        req.setAttribute("keyword", keyword);

        if(req.getParameter("select").equals("global")) {
            HttpSession se = req.getSession();
            if(se.getAttribute("account_session") != null)
            {
                List<FoundVacancy> foundVacancies = parser.getVacancies(keyword);
                req.setAttribute("matches", foundVacancies);
                req.setAttribute("isGlobal", true);
            } else { // в ином случае делаем redirect на авторизацию
                req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
                return;
            }
        }
        else { // выбрана локальная база
            List<Vacancy> vacancyList = service.getVacancyListByKeyword(keyword);
            req.setAttribute("matches", vacancyList);
            req.setAttribute("isGlobal", false);
        }

        /*if(req.getParameter("select") != null && req.getParameter("select").equals("global"))
            req.setAttribute("isGlobal", true);
        else
            req.setAttribute("isGlobal", false);*/
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }
}

