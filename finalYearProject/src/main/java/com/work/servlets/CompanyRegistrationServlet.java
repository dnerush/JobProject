package com.work.servlets;

import com.work.dto.CompanyDTO;
import com.work.service.impl.CompanyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sky_el on 28.04.2017.
 */
public class CompanyRegistrationServlet extends HttpServlet {

    private final CompanyServiceImpl companyService = new CompanyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/CompanyRegistration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String type = req.getParameter("type");
            String description = req.getParameter("description");
            String country = req.getParameter("country");
            String city = req.getParameter("city");
            String logo = null;
            String phone = req.getParameter("phone");
            String email = req.getParameter("email");
            String login = req.getParameter("login");
            String password1 = req.getParameter("pass1");
            String password2 = req.getParameter("pass2");

            CompanyDTO companyDTO = new CompanyDTO();
            companyDTO.setName(name);
            companyDTO.setType(type);
            companyDTO.setDescription(description);
            companyDTO.setCountry(country);
            companyDTO.setCity(city);
            companyDTO.setLogo(logo);
            companyDTO.setPhone(phone);
            companyDTO.setEmail(email);
            companyDTO.setLogin(login);
            companyDTO.setPassword1(password1);
            companyDTO.setPassword2(password2);

            companyService.registrationCompany(companyDTO);
            req.getRequestDispatcher("jsp/Authorization.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace(); // если пароли не совпадают
        }
    }
}
