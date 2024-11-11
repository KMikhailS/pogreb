package ru.kmikhails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kmikhails.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {
}
