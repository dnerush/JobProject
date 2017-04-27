package com.work.servlets;

import com.work.dto.EmployeeDTO;
import com.work.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sky_el on 16.03.2017.
 */
public class EmployeeRegistrationServlet extends HttpServlet {
    private EmployeeServiceImpl service = new EmployeeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/EmployeeRegistration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("secondName");
            int age  = Integer.parseInt(req.getParameter("age"));
            String sex = req.getParameter("sex");
            String country = req.getParameter("country");
            String city = req.getParameter("city");
            String phone = req.getParameter("phone");
            String email = req.getParameter("email");
            String login = req.getParameter("login");
            String password1 = req.getParameter("pass1");
            String password2 = req.getParameter("pass2");
            String photoPath = null;


            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setName(name);
            employeeDTO.setSecondName(surname);
            employeeDTO.setAge(age);
            employeeDTO.setSex(sex);
            employeeDTO.setCountry(country);
            employeeDTO.setCity(city);
            employeeDTO.setPhone(phone);
            employeeDTO.setEmail(email);
            employeeDTO.setLogin(login);
            employeeDTO.setPassword1(password1);
            employeeDTO.setPassword2(password2);
            employeeDTO.setPhotoPath(photoPath);
            service.registrationEmployee(employeeDTO);
        } catch (IllegalArgumentException e) {
            e.printStackTrace(); // если пароли не совпадают
        }
    }
}
