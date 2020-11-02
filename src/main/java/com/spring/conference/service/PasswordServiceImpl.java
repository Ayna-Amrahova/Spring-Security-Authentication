package com.spring.conference.service;

import com.spring.conference.model.Password;
import com.spring.conference.model.ResetToken;
import com.spring.conference.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Autowired
    private PasswordRepository passwordRepository;

    @Override
    public void createResetToken(Password password, String token) {
        ResetToken resetToken = new ResetToken();
        resetToken.setToken(token);
        resetToken.setEmail(password.getEmail());
        resetToken.setUsername(password.getUsername());

        passwordRepository.saveToken(resetToken);
    }

    @Override
    public boolean confirmResetToken(ResetToken token) {
        return false;
    }

    @Override
    public void update(Password password, String username) {
        passwordRepository.update(password, username);
    }
}
