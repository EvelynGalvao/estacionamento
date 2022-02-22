package br.com.estacionamento.estacionamento.model;
import javax.persistence.*;

@Entity
public class Estabelecimento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String Nome;
    private String CNPJ;
    private String Endereco;
    private int Telefone;
    private int QuantidadeVagasMotos;
    private int QuantidadeVagasCarros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estabelecimento( String nome, String cnpj, String endereco, int telefone, int quantidadeVagasMotos, int quantidadeVagasCarros) {

        Nome = nome;
        CNPJ = cnpj;
        Endereco = endereco;
        Telefone = telefone;
        QuantidadeVagasMotos = quantidadeVagasMotos;
        QuantidadeVagasCarros = quantidadeVagasCarros;
    }
    public Estabelecimento() {
    }
    }
