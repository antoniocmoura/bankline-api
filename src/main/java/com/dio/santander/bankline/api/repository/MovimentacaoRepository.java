package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Movimentacao;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
    public List<Movimentacao> findByIdConta(Integer idConta);
}
