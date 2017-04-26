package com.work.servlets;

import com.work.service.impl.CompanyServiceImpl;
import com.work.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sky_el on 22.03.2017.
 */
public class AutorizationServlet extends HttpServlet {

    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private CompanyServiceImpl companyService = new CompanyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/Autorization.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        /*List<Employee> employees = employeeService.getAll();
        List<Company> companies = companyService.getAll();

        List<Accountable> userList = new LinkedList<>();
        userList.addAll(employees);
        userList.addAll(companies);

        Accountable accountable;
        for(Accountable user : userList) {
            if(user instanceof Employee) {
                if (((Employee) user).getAccount().getLogin().equals(login) && ((Employee) user).getAccount().getPassword().equals(password)) {
                    req.getSession().setAttribute("session_user", (Employee)user);
                    break;
                }
                else if(((Company) user).getAccount().getLogin().equals(login) && ((Company) user).getAccount().getPassword().equals(password)) {
                    req.getSession().setAttribute("session_user", (Company)user);
                    break;
                }
            }
        }*/
    }
}
