package com.alexsanjr.integrations.services;

import com.alexsanjr.integrations.entities.EmailDTO;
import com.alexsanjr.integrations.services.exceptions.EmailException;
import com.postmarkapp.postmark.Postmark;
import com.postmarkapp.postmark.client.ApiClient;
import com.postmarkapp.postmark.client.data.model.message.Message;
import com.postmarkapp.postmark.client.data.model.message.MessageResponse;
import com.postmarkapp.postmark.client.exception.PostmarkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class MockEmailService implements EmailService {

    private Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void sendEmail(EmailDTO dto) {
        LOG.info("Sending email to: {}", dto.getTo());
        LOG.info("Email sent");

    }

}
