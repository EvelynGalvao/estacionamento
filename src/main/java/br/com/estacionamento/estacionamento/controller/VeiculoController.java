package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.controller.dto.VeiculoDto;
import br.com.estacionamento.estacionamento.controller.form.VeiculoForm;
import br.com.estacionamento.estacionamento.model.Veiculo;
import br.com.estacionamento.estacionamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VeiculoController {
@Autowired
    private VeiculoRepository veiculorepository;

        @RequestMapping("/veiculo")
                public List<VeiculoDto> lista(){
            List<Veiculo> veiculos = veiculorepository.findAll();

                    return VeiculoDto.converter(veiculos);

        }
    //@RequestMapping("/cadastrar")
      //  public <veiculo, form> void cadastrar(RequestMapping VeiculoForm form){

 //          Veiculo = veiculo form.converter();
   //         veiculorepository.save(veiculo);

        }






