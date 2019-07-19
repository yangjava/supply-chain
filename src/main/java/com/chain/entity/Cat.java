package com.chain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="const_cat")
@Entity
public class Cat {
    @Id
    private Integer id;

    private Integer pid;

    private String name;

    private String alias;
}
