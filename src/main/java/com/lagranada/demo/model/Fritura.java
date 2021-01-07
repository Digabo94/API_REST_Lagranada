package com.lagranada.demo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "fritura")
public class Fritura implements Serializable{
    
    private final static Long serialVersionUID = 2L;
    
    @Id
    private Integer id;
    private String name;
    private String mass;
    private String brand;
    private Float price;
    private Integer stock;
}
