package com.bytebuilder.apibonussplit.service.calculos;

import com.bytebuilder.apibonussplit.domain.calculos.CalculoVendas;
import com.bytebuilder.apibonussplit.domain.dtos.FuncionarioDto;
import com.bytebuilder.apibonussplit.domain.dtos.RemuneracaoDto;
import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.Funcionario;

import com.bytebuilder.apibonussplit.domain.enums.Cargo;
import com.bytebuilder.apibonussplit.repository.FuncionarioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Service
public class CalculoVariavelVendasServices {


    @Autowired
    private CalculoVendas calculoVendas;

    public RemuneracaoDto getCalculosRemuneracaoVenda(VendaDto vendaDto) {

        /*Buscar os dados do cliente na tabela pela matricula
         * Usar o departamento e o cargo para usar a estrategia de calculo variavel
         *
         *
         * Tratar retorno quando funcionario nao existir ou vier vazio a consulta
         * */
        log.info("--------------------------------------------------");
        log.info("Fazendo a busca pelo funcionario matricula: {} ", vendaDto.getNumeroMatricula());
        FuncionarioRepository repository = new FuncionarioRepository();
        List<Funcionario> funcionarios = repository.getFuncionarios();

        Funcionario funcionario = funcionarios.stream()
                .filter(item -> item.getCargo().equals(Cargo.VENDEDOR))
                .filter(item -> item.getNumeroMatricula().equals(vendaDto.getNumeroMatricula()))
                .collect(Collectors.toList()).get(0);

        //CriterioVenda criterioVendaModel = VendaDto.toModel(vendaDto);
        BigDecimal valorCalculado = calculoVendas.calcularRemuneracao(vendaDto);

        return RemuneracaoDto.builder()
                .valorApagar(valorCalculado.setScale(2, RoundingMode.HALF_EVEN))
                //.dtCriacao((criterioVendaModel.getDataVenda().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))))
                .funcionario(FuncionarioDto.toDto(funcionario))
                .build();
    }

}
