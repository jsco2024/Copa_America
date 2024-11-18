package com.Actividad1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ParticipantesEntity {

    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String status;
    private String userCreate;
    private String userUpdate;
    private String dateTimeCreate;
    private String dateTimeUpdate;

}
