package com.work.web;

import com.work.model.Account;
import com.work.service.impl.AccountServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AccountServiceImpl accountService = new AccountServiceImpl();
        List<Account> list =  accountService.accountList();

        System.out.println(list);

    }
}
