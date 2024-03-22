package com.example.spring.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.mongo.model.Account;

@Repository
public interface AccountsRepo extends MongoRepository<Account, Integer> {

}
