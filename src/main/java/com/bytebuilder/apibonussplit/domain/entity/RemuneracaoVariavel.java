package com.bytebuilder.apibonussplit.domain.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RemuneracaoVariavel {

    private BigDecimal valor;
    private String detalhes;
}
