package com.work.service.impl;

import com.work.dao.impl.CompanyDAO;
import com.work.dto.AccountDTO;
import com.work.dto.CompanyDTO;
import com.work.model.Account;
import com.work.model.Company;
import com.work.service.api.AccountService;
import com.work.service.api.CompanyService;

/**
 * Created by Sky_el on 23.03.2017.
 */
public class CompanyServiceImpl implements CompanyService {

    private CompanyDAO companyDAO = new CompanyDAO();

    private AccountService accountService = new AccountServiceImpl();

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
        companyDAO.save(company);
    }
}
