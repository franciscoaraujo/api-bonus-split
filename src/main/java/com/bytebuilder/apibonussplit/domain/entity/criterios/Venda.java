package com.bytebuilder.apibonussplit.domain.entity.criterios;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Venda {
    private Funcionario funcionario;
    private LocalDateTime dataVenda = LocalDateTime.now();
    private Integer quantidade;
    private BigDecimal valorVenda;
}
