package org.silvachristian.senha.repository;

import org.silvachristian.senha.entity.SenhaEntity;
import org.silvachristian.senha.entity.SenhaInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SenhaRepository extends JpaRepository<SenhaEntity, Long> {

    @Query("SELECT t.number AS number, t.type AS type, t.id AS id FROM ticket t ORDER BY (t.data) ASC LIMIT 1")
    SenhaInterface deleteSenha();
}
