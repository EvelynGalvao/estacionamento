package br.com.estacionamento.estacionamento.controller.form;

import br.com.estacionamento.estacionamento.model.Veiculo;
import br.com.estacionamento.estacionamento.repository.VeiculoRepository;

import public class Veiculo;
public class VeiculoForm {

    private String Marca;
    private String Modelo;
    private String Cor;
    private String Placa;
    private String Tipo;




    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public Veiculo converter(VeiculoRepository veiculoRepository) {
        String nomeVeiculo;
        Veiculo veiculo = veiculoRepository.findByVeiculoNome(nomeVeiculo);
        return new Veiculo(Marca, Modelo, Cor, Placa, Tipo);


    }
}
