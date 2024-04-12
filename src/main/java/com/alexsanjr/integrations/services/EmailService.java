package com.alexsanjr.integrations.services;

import com.alexsanjr.integrations.entities.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO emailDTO);
}
