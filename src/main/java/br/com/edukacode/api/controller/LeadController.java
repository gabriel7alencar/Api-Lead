package br.com.edukacode.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edukacode.api.dto.DadosAtualizacaoLead;
import br.com.edukacode.api.dto.DadosCadastroLead;
import br.com.edukacode.api.dto.DadosListagemLead;
import br.com.edukacode.api.entities.Lead;
import br.com.edukacode.api.repository.LeadRepository;
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
        repository.save(new Lead(null,dados.nome(),dados.email(),dados.telefone(),dados.cpf()));
        return "Lead criado com sucesso!";
    }
    @GetMapping
    public Page<DadosListagemLead> listarLeads(@PageableDefault(size = 15, sort={"nome"})Pageable paginacao) {
        // Lógica para listar leads
        return repository.findAll(paginacao).map(DadosListagemLead::new);
        // Lógica para listar leads
    }
    @PutMapping
    @Transactional
    public void atualizarLead(@RequestBody DadosAtualizacaoLead dados) {
        var lead = repository.getReferenceById(dados.id());
        lead.atualizarinformacoes(dados);
        // Lógica para atualizar um lead
    }
    @DeleteMapping
    public void excluirLead() {
        // Lógica para excluir um lead
    }
}
