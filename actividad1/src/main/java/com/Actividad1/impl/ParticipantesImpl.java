package com.Actividad1.impl;

import com.Actividad1.entity.ParticipantesEntity;
import com.Actividad1.repository.IParticipastesRepository;
import com.Actividad1.services.IParticipantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParticipantesImpl implements IParticipantesService {

    private final IParticipastesRepository participantesRepository;

    @Override
    public Optional<ParticipantesEntity> findById(String entity) {
        Optional<ParticipantesEntity> participantes = participantesRepository.findById(entity);
        return participantes;
    }

    @Override
    public List<ParticipantesEntity> findAll() {
        List<ParticipantesEntity> participantes = participantesRepository.findAll();
        return participantes;
    }

    @Override
    public ParticipantesEntity create(ParticipantesEntity entity) {
        entity.setUserCreate(entity.getUserCreate());
        entity.setDateTimeCreate(String.valueOf(new Date()));
        return participantesRepository.save(entity);
    }

    @Override
    public ParticipantesEntity update(String id, ParticipantesEntity entity) {
        return participantesRepository.findById(id).map(entity1 -> {
            entity1.setName(entity.getName());
            entity1.setLastName(entity.getLastName());
            entity1.setEmail(entity.getEmail());
            entity1.setStatus(entity.getStatus());
            entity1.setUserUpdate(entity.getUserUpdate());
            entity1.setDateTimeUpdate(String.valueOf(new Date()));
            return participantesRepository.save(entity1);
        }).orElseThrow(() -> new RuntimeException("User not Found"));
    }

    @Override
    public Optional<ParticipantesEntity> delete(String entity) {
        participantesRepository.deleteById(entity);
        return null;
    }
}