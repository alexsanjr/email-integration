package com.alexsanjr.integrations.config;

import com.alexsanjr.integrations.services.EmailService;
import com.alexsanjr.integrations.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
