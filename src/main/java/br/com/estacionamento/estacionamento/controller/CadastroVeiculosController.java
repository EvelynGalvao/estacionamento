package br.com.estacionamento.estacionamento.controller;


import br.com.estacionamento.estacionamento.controller.dto.VeiculosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroVeiculosController {
    @RequestMapping("/cadastro-de-veículos")
    @Autowired

    public VeiculosDto cadastroVeiculos() {
        return new VeiculosDto();
    }
}

