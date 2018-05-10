package io.github.jass2125.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.jass2125.domains.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
