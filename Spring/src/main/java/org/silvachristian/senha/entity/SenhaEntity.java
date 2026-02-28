package org.silvachristian.senha.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import java.util.Date;

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
    private Date data;
    @NonNull
    private Integer typeId;
}
