package ru.kmikhails.service;

import ru.kmikhails.dto.MailParams;

public interface ConsumerService {

    void consumeRegistrationMail(MailParams mailParams);
}
