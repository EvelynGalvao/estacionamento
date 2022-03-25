package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class VeiculoController {

  @RequestMapping("/veiculos")
  public List<Veiculo> lista() {
    Veiculo veiculo = new Veiculo("marca","modelo","cor","placa","tipo");
            return Arrays.asList(veiculo, veiculo, veiculo);


  }
    }







