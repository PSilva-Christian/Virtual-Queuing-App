package org.silvachristian.senha.controllers;

import org.silvachristian.senha.entity.SenhaEntity;
import org.silvachristian.senha.entity.SenhaInterface;
import org.silvachristian.senha.services.SenhaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/senhas"))
@CrossOrigin(origins = "http://localhost:4200")
public class SenhaController {

    private final SenhaService senhaService;

    SenhaController(SenhaService senhaService) {
        this.senhaService = senhaService;
    }

    @PostMapping
    public SenhaEntity addSenha(@RequestBody SenhaEntity ticket) {
        return senhaService.addSenha(ticket);
    }

    @GetMapping
    public List<SenhaEntity> getSenha(){
        return senhaService.showAll();
    }

    @DeleteMapping()
    public SenhaInterface delSenha() {
        return senhaService.deleteSenha();
    }

    @GetMapping("/increment")
    public Integer incrementSenha() {
        return senhaService.getLastSenhaNumber();
    }
}
