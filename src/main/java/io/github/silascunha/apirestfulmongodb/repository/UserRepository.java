package io.github.silascunha.apirestfulmongodb.repository;

import io.github.silascunha.apirestfulmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
