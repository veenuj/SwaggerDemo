package com.restaurant.nearByRest.Controller;


import com.restaurant.nearByRest.Entity.OrderEntity;

import com.restaurant.nearByRest.Service.OrderServiceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orderAPI")
public class OrderAPIcontroller {



    private OrderServiceimpl orderServiceimpl;
    @Autowired
    public OrderAPIcontroller(OrderServiceimpl orderServiceimpl) {
        this.orderServiceimpl = orderServiceimpl;
    }

    @GetMapping("/order")
    public List<OrderEntity> findAll() {
        return orderServiceimpl.findAll();
    }



    @GetMapping("/order/{orderId}")
    public Optional<OrderEntity> findAll(@PathVariable int orderId) {
        Optional<OrderEntity> theOrder = orderServiceimpl.findById(orderId);
        if(theOrder == null) {
            throw new RuntimeException("OrderEntity Id not found -"+ orderId);
        }

        return theOrder;
    }



    @PostMapping("/order")
    public OrderEntity save(@RequestBody OrderEntity theOrder) {

        theOrder.setId(0);
        orderServiceimpl.save(theOrder);

        return theOrder;
    }
    @PutMapping("/order")
    public OrderEntity update(@RequestBody OrderEntity theOrder) {

        orderServiceimpl.save(theOrder);

        return theOrder;
    }


    @DeleteMapping("/order/{theId}")
    public String delete(@PathVariable int theId) {

        orderServiceimpl.delete(theId);

        return  theId + "is deleted";
    }




}
