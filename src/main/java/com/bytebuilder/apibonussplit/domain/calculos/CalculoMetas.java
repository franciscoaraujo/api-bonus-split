package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.entity.criterios.Metas;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculoMetas implements CalculoRemuneracaoStrategy<Metas> {
    @Override
    public BigDecimal calcularRemuneracao(Metas... criteriosParam) {
        return null;
    }
}
