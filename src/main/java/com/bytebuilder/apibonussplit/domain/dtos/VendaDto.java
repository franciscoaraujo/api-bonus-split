package com.bytebuilder.apibonussplit.domain.dtos;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class VendaDto {
    private Integer numeroMatricula;
    private BigDecimal valorVenda;
}
