package br.com.edukacode.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")
public class LeadController {

    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados) {
        // Lógica para criar um lead
        return "Lead criado com sucesso!";
    }
    @GetMapping
    public void listarLeads() {
        // Lógica para listar leads
    }
    @PutMapping
    public void atualizarLead() {
        // Lógica para atualizar um lead
    }
    @DeleteMapping
    public void excluirLead() {
        // Lógica para excluir um lead
    }
}
