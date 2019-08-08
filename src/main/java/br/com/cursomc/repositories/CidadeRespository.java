package br.com.cursomc.repositories;

import br.com.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRespository extends JpaRepository<Cidade, Integer> {
}
