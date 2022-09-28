package com.portfolio.SpringBootBackEnd.repository;

import com.portfolio.SpringBootBackEnd.model.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Integer>{
    public Optional<Habilidades> findByNombreHabi(String nombreHabi);
    public boolean existsByNombreHabi(String nombreHabi);
    
}
