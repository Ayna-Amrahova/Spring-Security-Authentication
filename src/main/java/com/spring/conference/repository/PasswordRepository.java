package com.spring.conference.repository;

import com.spring.conference.model.Password;
import com.spring.conference.model.ResetToken;

public interface PasswordRepository {

    void saveToken(ResetToken resetToken);

    ResetToken findByToken(String token);

    void update(Password password, String username);
}
