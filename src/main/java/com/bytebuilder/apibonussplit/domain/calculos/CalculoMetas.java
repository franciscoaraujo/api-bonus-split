package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.dtos.MetasDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculoMetas implements CalculoRemuneracaoStrategy<MetasDto> {
    @Override
    public BigDecimal calcularRemuneracao(MetasDto... criteriosParam) {
        return null;
    }
}
