package com.proxy.account;

import java.util.List;

public interface Account {

    public List<String> getAccountDetails(String accountNo);

    public Double getBalance(String accountNo);

}
