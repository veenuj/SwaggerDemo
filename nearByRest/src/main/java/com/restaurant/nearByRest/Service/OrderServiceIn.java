package com.restaurant.nearByRest.Service;


import com.restaurant.nearByRest.Entity.LocationEntity;
import com.restaurant.nearByRest.Entity.OrderEntity;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface OrderServiceIn {


    public List<OrderEntity> findAll();


    public Optional<OrderEntity> findById(int theId);

    public void save(OrderEntity theOrd);

    public void delete(int theId);





}
