package com.work.dao.api;

import com.work.model.Account;

public interface AccountDAO extends DAO<Account> {
    long getAccountID(Account account);
}
