package com.kaki.building.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "building")
public class Building implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "building_id", nullable = false)
    private Long id;

    @Basic(optional = false)
    @Column(name = "building_name", nullable = false)
    private String name;

    @Basic(optional = false)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    private Set<BuildingCharacteristics>  characteristics;

    public Building(Long id, String name, Set<BuildingCharacteristics> characteristics) {
        this.id = id;
        this.name = name;
        this.characteristics = characteristics;
    }


    public Building() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BuildingCharacteristics> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Set<BuildingCharacteristics> characteristics) {
        this.characteristics = characteristics;
    }
}