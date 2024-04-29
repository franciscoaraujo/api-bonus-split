package com.bytebuilder.apibonussplit.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Remuneracao {
    private Funcionario funcionario;
    private BigDecimal valorApagar;
    private LocalDateTime dtCriacao;
}
