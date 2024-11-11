package ru.kmikhails.service;

import org.springframework.core.io.FileSystemResource;
import ru.kmikhails.entity.AppDocument;
import ru.kmikhails.entity.AppPhoto;
import ru.kmikhails.entity.BinaryContent;

public interface FileService {

    AppDocument getDocument(String id);

    AppPhoto getPhoto(String id);
}
