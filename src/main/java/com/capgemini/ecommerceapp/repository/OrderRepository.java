package com.capgemini.ecommerceapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ecommerceapp.entity.Orders;
@Repository
public interface OrderRepository extends MongoRepository<Orders, Integer> {

}
