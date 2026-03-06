package org.silvachristian.senha.services;

import org.silvachristian.senha.entity.SenhaCounter;
import org.silvachristian.senha.entity.SenhaEntity;
import org.silvachristian.senha.entity.SenhaInterface;
import org.silvachristian.senha.repository.CounterRepository;
import org.silvachristian.senha.repository.SenhaRepository;
import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class SenhaService {

    SenhaRepository senhaRepository;
    CounterRepository counterRepository;
    public SenhaService(SenhaRepository senhaRepository, CounterRepository counterRepository) {
        this.senhaRepository = senhaRepository;
        this.counterRepository = counterRepository;
    }

    public List<SenhaEntity> showAll(){
        return senhaRepository.findAll();
    }

    public SenhaEntity addSenha(SenhaEntity ticket){

        ticket.setDate(getHourInstant());

        if(ticket.getType().equals("SN")){
            ticket.setTypeId(0);
        }
        else {
            ticket.setTypeId(1);
        }
        changeSenhaCounter(true);
        ticket.setNumber(getLastSenhaNumber());
        return senhaRepository.save(ticket);
    }

    public SenhaInterface deleteSenha() {

        SenhaInterface deletedSenha = senhaRepository.showDeletedSenha();

        //deletedSenha.setCallTime(getHourInstant());
        changeSenhaCounter(false);

        senhaRepository.deleteById(deletedSenha.getId());
        return deletedSenha;
    }

    public void changeSenhaCounter(boolean moreOrLess){
        SenhaCounter counter = counterRepository.findById(1L).orElse(new SenhaCounter());
        if(moreOrLess){
            counter.setQtdSenha(counter.getQtdSenha() + 1);
        }
        else if(counter.getQtdSenha() > 0){
            counter.setQtdSenha(counter.getQtdSenha() - 1);
        }
        counterRepository.save(counter);
    }

    public Integer getLastSenhaNumber(){
        return counterRepository.findById(1L).orElse(new SenhaCounter()).getQtdSenha() + 1;
    }

    public String getHourInstant(){
        LocalTime nowDate = LocalTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("hh:mm:ss");

        return nowDate.format(dateFormat);
    }
}

