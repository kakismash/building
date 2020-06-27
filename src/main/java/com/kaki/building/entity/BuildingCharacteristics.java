package com.kaki.building.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "build_charact")
public class BuildingCharacteristics {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "char_id", nullable = false)
    private Long id;

    @Basic(optional = false)
    @Column(name = "char_key", nullable = false)
    private String key;

    @Basic(optional = false)
    @Column(name = "char_value", nullable = false)
    private String value;

    @JoinColumn(name = "building_id", referencedColumnName = "building_id", nullable = false)
    @ManyToOne(optional = false, fetch=FetchType.LAZY)
    private Building building;

    public BuildingCharacteristics() {
    }

    public BuildingCharacteristics(Long id, String key, String value, Building building) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    

}