package com.restaurant.nearByRest.Repositry;

import com.restaurant.nearByRest.Entity.LocationEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocReporitry extends JpaRepository<LocationEntity, String> {
    public  List<LocationEntity> findByLoc(String loc) ;

}
