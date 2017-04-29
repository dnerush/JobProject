package com.work.service.impl;

import com.work.dao.api.AccountDAO;
import com.work.dao.impl.AccountDAOImpl;
import com.work.dto.AccountDTO;
import com.work.model.Account;
import com.work.service.api.AccountService;

import java.util.List;

/**
 * Created by Sky_el on 16.03.2017.
 */
public class AccountServiceImpl implements AccountService {

    private final AccountDAO accountDAO = new AccountDAOImpl();

    public Account registerAccount(AccountDTO accountDTO) {
        //validation
        // ...
        // create object of Account
        Account account = new Account();
        // initialization
        account.setLogin(accountDTO.getLogin());
        account.setPassword(accountDTO.getPassword1());
        account.setEmail(accountDTO.getEmail());
        account.setPhone(accountDTO.getPhone());
        // transfer to DAO
        accountDAO.save(account);
        return account;
    }

    public List<Account> accountList() {
        return accountDAO.get();
    }
}
