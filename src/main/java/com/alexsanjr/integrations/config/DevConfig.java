package com.alexsanjr.integrations.config;

import com.alexsanjr.integrations.services.EmailService;
import com.alexsanjr.integrations.services.PostMarkEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService() {
        return new PostMarkEmailService();
    }
}
