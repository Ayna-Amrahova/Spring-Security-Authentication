package com.spring.conference.service;

import com.spring.conference.model.Password;
import com.spring.conference.model.ResetToken;

public interface PasswordService {

    void createResetToken(Password password, String token);

    boolean confirmResetToken(ResetToken token);

    void update(Password password, String username);

}
