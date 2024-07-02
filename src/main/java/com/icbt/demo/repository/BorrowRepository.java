package com.icbt.demo.repository;

import com.icbt.demo.model.Borrow;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowRepository extends MongoRepository<Borrow, ObjectId> {
}
