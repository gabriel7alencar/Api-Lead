package br.com.edukacode.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @GetMapping
    public String listar() {
        return "listando Generos";
    }

    @PostMapping
    public String criar(@RequestBody @Valid GeneroCadastro dados){
        return "Genero Cadastrado";
    }
}
