package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.controller.dto.VeiculoDto;

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
    VeiculoRepository repository;

  @GetMapping("/veiculo")
    public List<Veiculo> getAllVeiculos(){
      return repository.findAll();
  }
  @GetMapping("/veiculo/{id}")
  public Veiculo getVeiculoById(@PathVariable Long id){
      return repository.getById(id);
  }
  @PostMapping("/veiculo")
    public Veiculo saveVeiculo(@RequestBody Veiculo veiculo){
      return repository.save(veiculo);
  }
  @DeleteMapping("/veiculo/{id}")
    public void deleteVeiculo(@PathVariable Long id){
      repository.deleteById(id);
  }



    }







