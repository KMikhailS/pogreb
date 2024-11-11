package ru.kmikhails.service;

import ru.kmikhails.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
