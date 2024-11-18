package com.Actividad1.repository;

import com.Actividad1.entity.ParticipantesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParticipastesRepository extends MongoRepository <ParticipantesEntity, String> {
}
