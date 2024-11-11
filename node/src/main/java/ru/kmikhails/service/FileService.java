package ru.kmikhails.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.kmikhails.entity.AppDocument;
import ru.kmikhails.entity.AppPhoto;
import ru.kmikhails.service.enums.LinkType;

public interface FileService {

    AppDocument processDoc(Message telegramMessage);

    AppPhoto processPhoto(Message telegramMessage);

    String generateLink(Long docId, LinkType linkType);
}
