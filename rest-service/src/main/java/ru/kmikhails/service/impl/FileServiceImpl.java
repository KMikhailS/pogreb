package ru.kmikhails.service.impl;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import ru.kmikhails.dao.AppDocumentDAO;
import ru.kmikhails.dao.AppPhotoDAO;
import ru.kmikhails.entity.AppDocument;
import ru.kmikhails.entity.AppPhoto;
import ru.kmikhails.service.FileService;
import ru.kmikhails.utils.Decoder;

@Service
@Log4j
public class FileServiceImpl implements FileService {

    private final AppDocumentDAO appDocumentDAO;
    private final AppPhotoDAO appPhotoDAO;
    private final Decoder decoder;

    public FileServiceImpl(AppDocumentDAO appDocumentDAO, AppPhotoDAO appPhotoDAO, Decoder decoder) {
        this.appDocumentDAO = appDocumentDAO;
        this.appPhotoDAO = appPhotoDAO;
        this.decoder = decoder;
    }

    @Override
    public AppDocument getDocument(String hash) {
        Long id = decoder.idOf(hash);
        if (id == null) {
            return null;
        }
        return appDocumentDAO.findById(id).orElse(null);
    }

    @Override
    public AppPhoto getPhoto(String hash) {
        Long id = decoder.idOf(hash);
        if (id == null) {
            return null;
        }
        return appPhotoDAO.findById(id).orElse(null);
    }
}
