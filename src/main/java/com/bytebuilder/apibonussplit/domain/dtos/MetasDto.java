package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class MetasDto {
    private Integer numeroMatricula;
    private BigDecimal percentual;
}
