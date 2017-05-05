package com.work.dao.api;

import com.work.model.Account;

public interface AccountDAO extends DAO<Account> {
    int getAccountID(Account account);
    Account getAccountByID(int id);
}
