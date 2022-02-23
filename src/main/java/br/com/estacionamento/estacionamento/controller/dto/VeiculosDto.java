package br.com.estacionamento.estacionamento.controller.dto;

import br.com.estacionamento.estacionamento.model.Veiculo;
import org.springframework.boot.autoconfigure.amqp.ConnectionFactoryCustomizer;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class VeiculosDto {

    private Connection connection;

    String Id;
    String Marca;
    String Modelo;
    String Cor;
    String Placa;
    String Tipo;

    public VeiculosDto() {

        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Veiculo veiculo) {


    }

    private class ConnectionFactory {
        public Connection getConnection() {

            return null;
        }
    }
}
