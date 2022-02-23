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

    public Estabelecimento() {
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getQuantidadeVagasMotos() {
        return QuantidadeVagasMotos;
    }

    public void setQuantidadeVagasMotos(int quantidadeVagasMotos) {
        QuantidadeVagasMotos = quantidadeVagasMotos;
    }

    public int getQuantidadeVagasCarros() {
        return QuantidadeVagasCarros;
    }

    public void setQuantidadeVagasCarros(int quantidadeVagasCarros) {
        QuantidadeVagasCarros = quantidadeVagasCarros;
    }
}
