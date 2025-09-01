package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lead")
public class LeadController {
    @Autowired
    private LeadRepository repository;
    @PostMapping
    @Transactional
    public String criarLead(@RequestBody @Valid DadosCadastroLead dados) {
        // Lógica para criar um lead
        System.out.println("Lead criado com os dados"+dados);
        //null - persistence
        //sem null - merge
        repository.save(new Lead(null,dados.nome(),dados.email(),dados.telefone()));
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
