package ru.kmikhails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.entity.AppUser;

import java.util.Optional;

public interface AppUserDao extends JpaRepository<AppUser, Long> {

    AppUser findByTelegramUserId(Long telegramUserId);

    Optional<AppUser> findByEmail(String email);
}
