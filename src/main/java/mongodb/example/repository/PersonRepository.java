package mongodb.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mongodb.example.entity.PersonEntity;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity, Integer>{
    
}
