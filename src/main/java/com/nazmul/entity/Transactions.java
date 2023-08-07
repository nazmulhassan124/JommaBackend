package com.nazmul.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transaction_id;
    private Long user_id;

    private Long product_id;
    private Double order_amount;
    @CreationTimestamp
    private LocalDateTime created_on;

}

//    transaction_id    NUMBER NOT NULL PRIMARY KEY,
//    user_id           NUMBER,
//    product_id        NUMBER ,
//    order_amount      NUMBER,
//    created_on        TIMESTAMP (6)


//    ALTER TABLE transactions
//        ADD CONSTRAINT PRODUCT_R01 FOREIGN KEY (PRODUCT_ID)
//        REFERENCES PRODUCTS (PRODUCT_ID)
//        ENABLE VALIDATE;
//