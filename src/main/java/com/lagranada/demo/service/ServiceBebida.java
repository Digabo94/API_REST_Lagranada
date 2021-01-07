package com.lagranada.demo.service;

import com.lagranada.demo.dao.BebidaDao;
import java.util.List;
import org.springframework.stereotype.Service;
import com.lagranada.demo.model.Bebida;
import java.util.Optional;

@Service
public class ServiceBebida{
    
    BebidaDao bebidaDao;
    
    public List<Bebida> getAllElements(){
        return bebidaDao.findAll();
    }
    
    public Bebida findElementById(Integer id){
        return bebidaDao.findById(id).orElse(null);
    }
    
    public void updateElement(Bebida bebida){
        bebidaDao.save(bebida);
    }
    
    public void newBebida(Bebida bebida){
        if(this.findElementById(bebida.getId()) == null){
            bebidaDao.save(bebida);
        }
    }
    
    public void deleteElement(Integer id){
        bebidaDao.deleteById(id);
    }
    

}
