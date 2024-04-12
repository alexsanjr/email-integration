package com.alexsanjr.integrations.services;

import com.alexsanjr.integrations.entities.EmailDTO;
import com.alexsanjr.integrations.services.exceptions.EmailException;
import com.postmarkapp.postmark.Postmark;
import com.postmarkapp.postmark.client.ApiClient;
import com.postmarkapp.postmark.client.data.model.message.Message;
import com.postmarkapp.postmark.client.data.model.message.MessageResponse;
import com.postmarkapp.postmark.client.exception.PostmarkException;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class PostMarkEmailService implements EmailService {

    @Value("${API_KEY}")
    private String apiKey;

    public void sendEmail(EmailDTO dto) {
        try {
            ApiClient client = Postmark.getApiClient(apiKey);
            Message message = new Message(dto.getFromEmail(), dto.getTo(), dto.getSubject(), dto.getBody());
            MessageResponse response = client.deliverMessage(message);
        } catch (IOException | PostmarkException e) {
            throw new EmailException(e.getMessage());
        }
    }
}
