package com.icbt.demo.repository;

import com.icbt.demo.model.Report;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<Report, ObjectId> {
}
