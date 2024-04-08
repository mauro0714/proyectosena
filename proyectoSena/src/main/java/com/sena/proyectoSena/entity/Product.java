package com.sena.proyectoSena.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_products")
@Data

public class Product {

   @Id
    private Long idProduct;
    private String name;
    private String brand;
    private boolean expired;
    private float price; 

    @ManyToOne
    @JoinColumn(
            name = "id",
            referencedColumnName = "id_local"
    )
    private Local Local;
}
