package com.lagranada.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bebida")
public class Bebida implements Serializable {

    private final static Long serialVersionUID = 1L;

    @Id
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String volume;
    @JsonProperty
    private String brand;
    @JsonProperty
    private Float price;
    @JsonProperty
    private Integer stock;
}
