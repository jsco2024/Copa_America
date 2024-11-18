package com.Actividad1.services;

import com.Actividad1.entity.ParticipantesEntity;

import java.util.List;
import java.util.Optional;

public interface IParticipantesService {

    public Optional<ParticipantesEntity> findById(String entity);
    public List<ParticipantesEntity> findAll();
    public ParticipantesEntity create(ParticipantesEntity entity);
    public ParticipantesEntity update(String id, ParticipantesEntity entity);
    public Optional<ParticipantesEntity> delete(String entity);
}
