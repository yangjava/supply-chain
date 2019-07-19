package com.chain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="const_brand")
@Entity
public class Brand {
    @Id
    private Integer id;

    private String name;
}
