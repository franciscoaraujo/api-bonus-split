package com.bytebuilder.apibonussplit.domain.entity.criterios;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Produtividade {
    private Funcionario funcionario;
    private LocalDateTime dtCadastroProdutividade = LocalDateTime.now();
    private Integer unidadeProduzida;
}
