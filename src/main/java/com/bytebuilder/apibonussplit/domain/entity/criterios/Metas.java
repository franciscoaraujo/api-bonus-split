package com.bytebuilder.apibonussplit.domain.entity.criterios;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class Metas {
    private Funcionario funcionario;
    private LocalDateTime dtMetaAlcancada = LocalDateTime.now();
    private BigDecimal percentual;
}
