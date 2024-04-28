package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.calculos.CalculoRemuneracaoStrategy;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Produtividade;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculoProdutividade implements CalculoRemuneracaoStrategy<Produtividade> {
    @Override
    public BigDecimal calcularRemuneracao(Produtividade... criteriosParam) {
        return null;
    }
}
