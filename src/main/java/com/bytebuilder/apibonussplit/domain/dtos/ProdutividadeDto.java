package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProdutividadeDto {
    private Funcionario funcionario;
    private LocalDateTime dtCadastroProdutividade = LocalDateTime.now();
    private Integer unidadeProduzida;
}
