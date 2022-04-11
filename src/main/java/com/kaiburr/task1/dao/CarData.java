package com.kaiburr.task1.dao;

import java.math.BigInteger;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.kaiburr.task1.myentities.Cars;

public interface CarData extends MongoRepository<Cars, BigInteger> {
	
}