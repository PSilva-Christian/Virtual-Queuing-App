package org.silvachristian.senha.repository;

import org.silvachristian.senha.entity.SenhaCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends JpaRepository<SenhaCounter,Long> {
}
