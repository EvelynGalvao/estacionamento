package br.com.estacionamento.estacionamento.model;
import javax.persistence.*;

@Entity
public class Estabelecimento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String cnpj;
    private String endereco;
    private int telefone;
    private int quantidadeVagasMotos;
    private int quantidadeVagasCarros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estabelecimento() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeVagasMotos() {
        return quantidadeVagasMotos;
    }

    public void setQuantidadeVagasMotos(int quantidadeVagasMotos) {
        this.quantidadeVagasMotos = quantidadeVagasMotos;
    }

    public int getQuantidadeVagasCarros() {
        return quantidadeVagasCarros;
    }

    public void setQuantidadeVagasCarros(int quantidadeVagasCarros) {
        this.quantidadeVagasCarros = quantidadeVagasCarros;
    }
}
