package com.ismael.user.infraestructure.repository;
import com.ismael.user.domain.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<User, String> {

}
