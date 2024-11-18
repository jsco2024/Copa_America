package com.Actividad1.controller;

import com.Actividad1.entity.ParticipantesEntity;
import com.Actividad1.services.IParticipantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequestMapping("/participantes")
@RestController
@RequiredArgsConstructor
public class ParticipantesController {

    private final IParticipantesService participantesService;

    @GetMapping("/list/{id}")
    public Optional<ParticipantesEntity> findById(@PathVariable String id){
        return participantesService.findById(id);
    }

    @GetMapping("/list/all")
    public List<ParticipantesEntity> findAll(){
        return participantesService.findAll();
    }

    @PostMapping("/addData")
    public ParticipantesEntity addNew(@RequestBody ParticipantesEntity entity){
        return participantesService.create(entity);
    }

    @PutMapping("/updateData/{id}")
    public  ParticipantesEntity updateData(@PathVariable String id, @RequestBody ParticipantesEntity entity){
        return  participantesService.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    public Optional<ParticipantesEntity> deleteData(@PathVariable String id){
        participantesService.delete(id);
        return null;
    }
}
