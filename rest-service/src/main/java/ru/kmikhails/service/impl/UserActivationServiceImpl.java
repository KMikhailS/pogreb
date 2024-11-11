package ru.kmikhails.service.impl;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import ru.kmikhails.dao.AppUserDao;
import ru.kmikhails.service.UserActivationService;
import ru.kmikhails.utils.Decoder;

@Service
@Log4j
public class UserActivationServiceImpl implements UserActivationService {

    private final AppUserDao appUserDAO;

    private final Decoder decoder;

    public UserActivationServiceImpl(AppUserDao appUserDAO, Decoder decoder) {
        this.appUserDAO = appUserDAO;
        this.decoder = decoder;
    }

    @Override
    public boolean activation(String cryptoUserId) {
        var userId = decoder.idOf(cryptoUserId);
        log.debug(String.format("User activation with user-id=%s", userId));
        if (userId == null) {
            return false;
        }

        var optional = appUserDAO.findById(userId);
        if (optional.isPresent()) {
            var user = optional.get();
            user.setIsActive(true);
            appUserDAO.save(user);
            return true;
        }
        return false;
    }
}
