package com.bytebuilder.apibonussplit.domain.entity.criterio;

import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class CriterioVariavelDeCalculo {
    private CriterioCalculo criterioCalculo;
    private BigDecimal valorBaseCriterio;
    private BigDecimal valorOffSet;
    private LocalDateTime dtCriacao = LocalDateTime.now();
}
/*Esse modelo de objeto sera utilizado para criar uma tabela onde será armazenada os valores
* relacionado aos criterios utilizador para o calculo, podendo ser alterado conforme a necessidade do
* usuario.
* */