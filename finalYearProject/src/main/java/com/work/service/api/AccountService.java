package com.work.service.api;

import com.work.dto.AccountDTO;
import com.work.model.Account;

public interface AccountService {
    Account registerAccount(AccountDTO accountDTO);
}
