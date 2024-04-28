package com.bytebuilder.apibonussplit.domain.entity.criterios;

import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class VariavelDeCalculo {
    private CriterioCalculo criterioCalculo;
    private BigDecimal valorBaseCriterio;
    private BigDecimal valorBonus;
    private LocalDateTime dtCriacao = LocalDateTime.now();
}
