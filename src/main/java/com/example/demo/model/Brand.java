package com.example.demo.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "brand")
@EntityListeners(AuditingEntityListener.class)
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public long getId() {
    	return this.id;
    }
    public void setId(long id) {
    	this.id = id;
    }

    @Column(name = "name", nullable = false)
    private String name;


    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }


    @Column(name = "country", nullable = false)
    private float country;


    public float getCountry() {
    	return this.country;
    }
    public void setCountry(float country) {
    	this.country = country;
    }

    
    @Column(name = "brand_id", nullable = false)
    private int brandId;


    public int getBrandId() {
    	return this.brandId;
    }
    public void setBrandId(int brandId) {
    	this.brandId = brandId;
    }
}
