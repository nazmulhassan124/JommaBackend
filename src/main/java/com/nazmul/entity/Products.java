package com.nazmul.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long product_id;
    private String  product_name;
    private String product_code;
    private double unit_price;
    private  double gain_loss;
    private int year_to_date;
    @Column(columnDefinition = "boolean default true")
    private boolean active_status ;
}






//    product_id       NUMBER NOT NULL PRIMARY KEY,
//    product_name     VARCHAR2 (200 BYTE),
//    product_code     VARCHAR2 (50 BYTE),
//    unit_price       NUMBER,
//    gain_loss        NUMBER,
//    year_to_date     NUMBER,
//    active_status    NUMBER (1) DEFAULT 1
