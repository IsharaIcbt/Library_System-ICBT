package com.icbt.demo.repository;

import com.icbt.demo.model.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, ObjectId> {
}
