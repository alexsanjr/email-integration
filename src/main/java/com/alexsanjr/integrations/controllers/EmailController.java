package com.alexsanjr.integrations.controllers;

import com.alexsanjr.integrations.entities.EmailDTO;
import com.alexsanjr.integrations.services.EmailService;
import com.postmarkapp.postmark.client.exception.PostmarkException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO email) throws PostmarkException, IOException {
        emailService.sendEmail(email);
        return ResponseEntity.noContent().build();
    }
}
