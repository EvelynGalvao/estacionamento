package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.controller.dto.VeiculoDto;
import br.com.estacionamento.estacionamento.controller.form.VeiculoForm;
import br.com.estacionamento.estacionamento.model.Veiculo;
import br.com.estacionamento.estacionamento.repository.VeiculoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculorepository;

    @GetMapping
    public List<VeiculoDto> lista(String nomeVeiculo) {
        if (nomeVeiculo == null) {
            List<Veiculo> veiculos = veiculorepository.findAll();
            return VeiculoDto.converter(veiculos);
        } else {
            List<Veiculo> veiculos = veiculorepository.findByVeiculoNome(nomeVeiculo);
            return VeiculoDto.converter(veiculos);
        }
    }

    @PostMapping
    public void cadastrar(@NotNull @RequestBody VeiculoForm form) {

       Veiculo veiculo = form.converter();

        veiculorepository.save(veiculo);

    }
}






