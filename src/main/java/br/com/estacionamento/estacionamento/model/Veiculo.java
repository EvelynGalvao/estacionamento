package br.com.estacionamento.estacionamento.model;
import jdk.jfr.DataAmount;

import  javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity



public class Veiculo {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;


    public Veiculo(Long id, String marca, String modelo) {
        Id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa =  placa;
        this.tipo = tipo;



    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
