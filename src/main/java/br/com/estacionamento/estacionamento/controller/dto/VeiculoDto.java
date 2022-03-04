package br.com.estacionamento.estacionamento.controller.dto;

import br.com.estacionamento.estacionamento.model.Veiculo;

import java.util.List;

public class VeiculoDto<connection> {

    String Id;
    String marca;
    String modelo;
    String cor;
    String placa;
    String tipo;


    public static List<VeiculoDto> converter(List<Veiculo> asList) {
        return null;
    }
}

