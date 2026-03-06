package org.silvachristian.senha.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity(name = "ticket")
@Table(name = "tickets")
@Getter
@Setter
public class SenhaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String type;
    @NonNull
    private Integer number;
    @NonNull
    private String date;
    @NonNull
    private Integer typeId;
    @NonNull
    private String callTime;

}
