package com.lagranada.demo.api;

import com.lagranada.demo.dao.BebidaDao;
import com.lagranada.demo.model.Bebida;
import com.lagranada.demo.service.ServiceBebida;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controlador {

    ServiceBebida serviceBebida;

    @GetMapping
    public List<Bebida> getBebidas() {
        return serviceBebida.getAllElements();
    }

    @GetMapping("/{id}")
    public Bebida findBebida(@PathVariable("id") Integer id) {
        return serviceBebida.findElementById(id);
    }

    @PutMapping
    public void updateBebida(@RequestBody Bebida bebida) {
        serviceBebida.updateElement(bebida);
    }
    
    @PostMapping
    public void newBebida(@RequestBody Bebida bebida){
        serviceBebida.newBebida(bebida);
    }
    
    @DeleteMapping("/{id}")
    public void deleteBebida(@PathVariable("id") Integer id){
        serviceBebida.deleteElement(id);
    }

}
