package com.icbt.demo.repository;

import com.icbt.demo.model.Reservation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, ObjectId> {
}
