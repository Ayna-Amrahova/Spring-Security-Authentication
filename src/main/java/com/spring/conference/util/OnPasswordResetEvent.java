package com.spring.conference.util;

import com.spring.conference.model.Password;
import org.springframework.context.ApplicationEvent;

public class OnPasswordResetEvent extends ApplicationEvent {
    private String appUrl;
    private Password password;

    public OnPasswordResetEvent(Password password, String appUrl) {
        super(password);

        this.appUrl = appUrl;
        this.password = password;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
