package br.com.estacionamento.estacionamento.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Marca;
    private String Modelo;
    private String Cor;
    private String Placa;
    private String Tipo;

    public Veiculo( String marca, String modelo, String cor, String placa, String tipo) {

        Marca = marca;
        Modelo = modelo;
        Cor = cor;
        Placa = placa;
        Tipo = tipo;


    }
    public Veiculo(){
    }
}
