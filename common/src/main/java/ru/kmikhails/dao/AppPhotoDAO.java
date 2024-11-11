package ru.kmikhails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}
