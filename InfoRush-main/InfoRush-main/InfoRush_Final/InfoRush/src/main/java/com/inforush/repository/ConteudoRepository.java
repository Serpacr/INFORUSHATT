package com.inforush.repository;

import com.inforush.model.Conteudo;
import com.inforush.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, Long> {
    List<Conteudo> findByArea(Area area);
    List<Conteudo> findByTituloContainingIgnoreCase(String titulo);
}
