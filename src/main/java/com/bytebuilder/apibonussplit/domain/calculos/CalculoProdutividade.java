package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.dtos.ProdutividadeDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculoProdutividade implements CalculoRemuneracaoStrategy<ProdutividadeDto> {
    @Override
    public BigDecimal calcularRemuneracao(ProdutividadeDto... criteriosParam) {
        return null;
    }
}
