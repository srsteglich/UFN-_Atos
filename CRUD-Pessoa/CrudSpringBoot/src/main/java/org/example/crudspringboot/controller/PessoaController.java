package org.example.crudspringboot.controller;

import org.example.crudspringboot.model.Pessoa;
import org.example.crudspringboot.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/pessoa")
public class PessoaController {
    //declarar o construtor
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping(path = {"/", "index"})
    public String index() {
        return "index";
    }

    //metodo que devolve um formulário ao usuário
    @GetMapping(path ="/cadastrar")
    public String cadastrarPessoa(Model model) {
        model.addAttribute ("pessoa", new Pessoa());
        return "cadastrarPessoa";
    }

    //salva novas pessoas no banco de dados
    @PostMapping(path = "/save")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa, Model model) {
        //salvar pessoas no banco;
        pessoaRepository.save(pessoa);
        //Atualizando a lista de pessoa e retornando a página de listar pessoas
        List<Pessoa> listaPessoa = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("listaPessoa", listaPessoa);
        return "listarPessoas";
    }

    //mostra todas as pessoas do banco de dados
    @GetMapping(path = "/listar")
    public String listarPessoas(@ModelAttribute Pessoa pessoa, Model model) {
        List<Pessoa> listaPessoa = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("listaPessoa", listaPessoa);
        return "listarPessoas";
    }

    @GetMapping("/alterar/{id}")
    public String alterarPessoa(@PathVariable Long id, Model model) {
        Optional<Pessoa> p = pessoaRepository.findById(Math.toIntExact(id));
        model.addAttribute("pessoa", p.get());
        return "alterarPessoa";
    }

    @PostMapping("/alterar")
    public String alterarPessoa(@ModelAttribute Pessoa pessoaAlterada, Model model) {
        pessoaRepository.save(pessoaAlterada);
        List<Pessoa> listaPessoa = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("listaPessoa", listaPessoa);
        return "listarPessoas";
    }

    @GetMapping("/excluir/{id}")
    public String confirmarPessoa(@PathVariable Long id, Model model) {
        Optional<Pessoa> p = pessoaRepository.findById(Math.toIntExact(id));
        //Pessoa pessoa = pessoaOptional.get();
        model.addAttribute("pessoa", p.get());
        return "excluirPessoa";

    }

    @PostMapping("/excluir/{id}")
    public String excluirPessoa(@PathVariable Long id, Model model) {
        Optional<Pessoa> p = pessoaRepository.findById(Math.toIntExact(id));
        pessoaRepository.delete(p.get());
        List<Pessoa> listaPessoa = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("listaPessoa", listaPessoa);
        return "listarPessoas";
    }

}
