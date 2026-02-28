package org.silvachristian.senha.services;

import org.silvachristian.senha.entity.SenhaEntity;
import org.silvachristian.senha.entity.SenhaInterface;
import org.silvachristian.senha.repository.SenhaRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class SenhaService {

    SenhaRepository senhaRepository;
    public SenhaService(SenhaRepository senhaRepository) {
        this.senhaRepository = senhaRepository;
    }

    public List<SenhaEntity> showAll(){
        return senhaRepository.findAll();
    }

    public SenhaEntity addSenha(SenhaEntity ticket){
        ticket.setData(Date.from(Instant.now()));
        if(ticket.getType().equals("sn")){
            ticket.setTypeId(0);
        }
        else {
            ticket.setTypeId(1);
        }
        return senhaRepository.save(ticket);
    }

    public SenhaInterface deleteSenha() {
        return senhaRepository.deleteSenha();

    }
}
