package com.bancomaster.vorcaro_api.repository;

import com.bancomaster.vorcaro_api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto>findByOptional();
}