package org.serratec.avaliacao.repository;

import org.serratec.avaliacao.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
