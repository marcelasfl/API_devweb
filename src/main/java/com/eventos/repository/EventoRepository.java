package com.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventos.models.evento;

public interface EventoRepository extends JpaRepository<evento, Long> {
}
