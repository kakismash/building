package com.kaki.building.controller;

import com.kaki.building.dao.BuildingDAO;
import com.kaki.building.entity.Building;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/building")
public class buildingCtrl {
    
    @Autowired
    private BuildingDAO buildingDao;

    @GetMapping()
    public Collection<Building> list(){
        
        Collection<Building> buildings = new ArrayList<>();
        
        buildingDao.findAll().forEach(building -> buildings.add(building));
        
        return buildings;
    }

}