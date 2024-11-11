package ru.kmikhails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
