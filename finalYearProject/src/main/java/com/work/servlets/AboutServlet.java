package com.work.servlets;

import com.work.model.Account;
import com.work.model.Company;
import com.work.model.Employee;
import com.work.service.impl.CompanyServiceImpl;
import com.work.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Sky_el on 14.03.2017.
 */
public class AboutServlet extends HttpServlet {

    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private final CompanyServiceImpl companyService = new CompanyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession se = req.getSession();
        if (se.getAttribute("account_session") != null)
        {
            Account account = (Account) se.getAttribute("account_session");
            Employee employee;
            Company company;
            if((employee = employeeService.getEmployeeByID(account.getId())) != null) {
                req.setAttribute("employee", employee);
            }
            else if((company = companyService.getCompanyByID(account.getId())) != null) {
                req.setAttribute("company", company);
            }

            req.setAttribute("account", account);
            req.getRequestDispatcher("jsp/About.jsp").forward(req, resp);
        }
        else
        {
            req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
        }

        //se.removeAttribute("account_session");
    }
}
