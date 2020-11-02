package com.spring.conference.service;

import com.spring.conference.model.Account;

public interface AccountService {

    public Account create (Account account);

    void createVerificationToken(Account account, String token);

    void confirmAccount(String token);
}
