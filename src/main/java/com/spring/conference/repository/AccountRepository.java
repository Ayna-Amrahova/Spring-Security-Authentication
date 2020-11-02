package com.spring.conference.repository;

import com.spring.conference.model.Account;
import com.spring.conference.model.ConferenceUserDetails;
import com.spring.conference.model.VerificationToken;

public interface AccountRepository {

    public Account create (Account account);

    void saveToken(VerificationToken verificationToken);

    VerificationToken findByToken(String token);

    Account findByUsername(String username);

    void createUserDetails(ConferenceUserDetails userDetails);

    void createAuthorities(ConferenceUserDetails userDetails);

    void delete(Account account);

    void deleteToken(String token);
}
