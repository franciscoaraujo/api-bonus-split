package com.bytebuilder.apibonussplit.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Remuneracao {
    private Funcionario funcionario;

    private BigDecimal valorApagar;

    private LocalDateTime dtCriacao;
}
