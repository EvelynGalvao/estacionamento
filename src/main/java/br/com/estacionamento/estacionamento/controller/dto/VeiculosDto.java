package br.com.estacionamento.estacionamento.controller.dto;

import br.com.estacionamento.estacionamento.model.Veiculo;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.autoconfigure.amqp.ConnectionFactoryCustomizer;
import org.springframework.jca.cci.connection.ConnectionFactoryUtils;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class VeiculosDto<connection> {

    String Id;
    String Marca;
    String Modelo;
    String Cor;
    String Placa;
    String Tipo;




    }

