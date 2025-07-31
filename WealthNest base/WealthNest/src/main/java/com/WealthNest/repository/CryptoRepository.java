package com.WealthNest.repository;

import com.WealthNest.model.CryptoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CryptoRepository extends MongoRepository<CryptoModel, String> {

}
