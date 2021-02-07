package com.hatanaka.ecommerce.checkout.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    

}
