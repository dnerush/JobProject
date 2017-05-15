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

    private final MainPageServlet mainPageServlet = new MainPageServlet();
    private final VacancyServiceImpl service = new VacancyServiceImpl();
    /*
    * Объект, с помощью которого выполняется парсинг сайтов
     */
    private Parser parser = new Parser();
    /*
    * Ключевое слово
    * */
    private String keyword;
    /*
    * Номер страницы
    * */
    private int page = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        mainPageServlet.initLoginOfAuthorizedUser(req);

        req.setAttribute("isGlobal", ((req.getParameter("isGlobal")) != null) ? req.getParameter("isGlobal") : false);
        req.setAttribute("keyword", ((req.getParameter("keyword")) != null) ? req.getParameter("keyword") : "");

        String spage; // строковое представление идентификатора страницы
        if((spage = req.getParameter("act")) != null) {
            //if(req.getParameter("select").equals("global")) {
                page += (req.getParameter("act").equals("next") ? 1 : (page != 1 ? -1 : 0));
                keyword = req.getParameter("keyword");
                List<FoundVacancy> foundVacancies = parser.getVacancies(keyword, page);
                if(foundVacancies.size() == 0) { // если следующая страница пустая - мы делаем "шаг назад"
                    --page;
                    foundVacancies = parser.getVacancies(keyword, page);
                }
                req.setAttribute("matches", foundVacancies);
            //}
        }

        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String keyword = req.getParameter("keyword");

        // сохраняем введенной пользователем ключевое слово, чтоб мы могли отобразить его в том же поле при redirect'e
        req.setAttribute("keyword", keyword);

        if(req.getParameter("select").equals("global")) {
            HttpSession se = req.getSession();
            if(se.getAttribute("account_session") != null)
            {
                List<FoundVacancy> foundVacancies = parser.getVacancies(keyword, page);
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

        mainPageServlet.initLoginOfAuthorizedUser(req);
        req.getRequestDispatcher("jsp/FindVacancy.jsp").forward(req, resp);
    }
}

