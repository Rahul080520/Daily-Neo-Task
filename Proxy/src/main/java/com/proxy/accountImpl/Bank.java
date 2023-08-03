package com.proxy.accountImpl;

import com.proxy.account.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Bank implements Account {

    List<String> details = new ArrayList<>(List.of("1345", "KBKK000", "qwerty"));
    @Override
    public List<String> getAccountDetails(String accountNo) {
        if (!details.contains(accountNo))
            throw new RuntimeException("Account not present!!!");
        return details;
    }

    @Override
    public Double getBalance(String accountNo) {
        if (!details.contains(accountNo))
            throw new RuntimeException("Account not present!!!");
        return 14703.00;
    }
}
