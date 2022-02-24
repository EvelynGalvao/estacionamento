package br.com.estacionamento.estacionamento.repository;

import br.com.estacionamento.estacionamento.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    }
