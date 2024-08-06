package org.example.crudspringboot.repository;

import org.example.crudspringboot.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository <Pessoa, Integer> {
}
