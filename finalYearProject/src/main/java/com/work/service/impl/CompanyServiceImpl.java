package com.work.service.impl;

import com.work.dao.api.AccountDAO;
import com.work.dao.impl.AccountDAOImpl;
import com.work.dao.impl.CompanyDAOImpl;
import com.work.dto.AccountDTO;
import com.work.dto.CompanyDTO;
import com.work.model.Account;
import com.work.model.Company;
import com.work.service.api.CompanyService;

import java.util.List;

/**
 * Created by Sky_el on 23.03.2017.
 */
public class CompanyServiceImpl implements CompanyService {

    private final CompanyDAOImpl companyDAO = new CompanyDAOImpl();

    private final AccountDAO accountDAO = new AccountDAOImpl();

    private final AccountServiceImpl accountService = new AccountServiceImpl();

    public void registrationCompany(CompanyDTO companyDTO) {
        // validation
        // ...

        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setLogin(companyDTO.getLogin());
        accountDTO.setPassword1(companyDTO.getPassword1());
        accountDTO.setPassword2(companyDTO.getPassword2());
        accountDTO.setEmail(companyDTO.getEmail());
        accountDTO.setPhone(companyDTO.getPhone());
        Account account = accountService.registerAccount(accountDTO);

        Company company = new Company();
        company.setName(companyDTO.getName());
        company.setType(companyDTO.getType());
        company.setDescription(companyDTO.getDescription());
        company.setLogo(companyDTO.getLogo());
        company.setCountry(companyDTO.getCountry());
        company.setCity(companyDTO.getCity());
        company.setId(account.getId());
        // тянем с базы автоинкрементирующийся id аккаунта
        int accountId = accountDAO.getAccountID(account);
        // инициализируем им employee id
        company.setId(accountId);
        companyDAO.save(company);
    }

    public List<Company> companyList() {
        return companyDAO.get();
    }

    public Company getCompanyByID(long id) {
        return companyDAO.getCompanyByID(id);
    }

    public void deleteEmployee(int id) {
        // получаем аккаунт по id(Company.id == Account.id)
        companyDAO.delete(id);
        accountService.deleteAccount(id);

    }
}
