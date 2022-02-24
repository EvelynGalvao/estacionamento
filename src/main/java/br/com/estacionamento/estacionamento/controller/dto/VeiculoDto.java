package br.com.estacionamento.estacionamento.controller.dto;

import br.com.estacionamento.estacionamento.model.Veiculo;

import java.util.List;

public class VeiculoDto<connection> {

    String Id;
    String Marca;
    String Modelo;
    String Cor;
    String Placa;
    String Tipo;


    public static List<VeiculoDto> converter(List<Veiculo> asList) {
        return null;
    }
}

