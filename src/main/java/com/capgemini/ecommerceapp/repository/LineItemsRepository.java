package com.capgemini.ecommerceapp.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ecommerceapp.entity.LineItems;
@Repository
public interface LineItemsRepository extends MongoRepository<LineItems, Integer> {

}
