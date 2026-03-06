package org.silvachristian.senha.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SenhaCounter {

    @Id
    private Long id = 1L;
    @NonNull
    private Integer qtdSenha = 0;
}
