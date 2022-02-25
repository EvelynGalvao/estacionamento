package br.com.estacionamento.estacionamento.repository;

import br.com.estacionamento.estacionamento.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
        List<Veiculo> findByVeiculoNome(String nomeVeiculo);
    }
