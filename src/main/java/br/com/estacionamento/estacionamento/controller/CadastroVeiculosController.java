package br.com.estacionamento.estacionamento.controller;


import br.com.estacionamento.estacionamento.controller.dto.CadastroVeiculosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CadastroVeiculosController {
    @RequestMapping("/cadastro-de-veículos")
    @Autowired

    public CadastroVeiculosDto cadastroVeiculos() {
        return new CadastroVeiculosDto();
    }
}

