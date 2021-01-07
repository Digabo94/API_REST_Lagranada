package com.lagranada.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lagranada.demo.model.Bebida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("BebidaDao")
public interface BebidaDao extends JpaRepository<Bebida, Integer>{
    
    
}
