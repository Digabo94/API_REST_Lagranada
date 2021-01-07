package com.lagranada.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lagranada.demo.model.Fritura;

@Repository("FrituraDao")
public interface FrituraDao extends JpaRepository<Fritura, Integer>{
    
}
