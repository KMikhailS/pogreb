package ru.kmikhails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}
