package com.proxy.accountImpl;

import com.proxy.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Atm implements Account {

    @Autowired
    private Bank bank;

    @Override
    public List<String> getAccountDetails(String accountNo) {
        return bank.getAccountDetails(accountNo);
    }

    @Override
    public Double getBalance(String accountNo) {
        return bank.getBalance(accountNo);
    }
}
