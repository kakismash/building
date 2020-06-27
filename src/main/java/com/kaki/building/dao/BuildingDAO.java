/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaki.building.dao;

import com.kaki.building.entity.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alfia
 */
@Repository
public interface BuildingDAO extends CrudRepository<Building, Long> {
    
}
