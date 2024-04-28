package com.bytebuilder.apibonussplit.domain.calculos;

import java.math.BigDecimal;

public interface CalculoRemuneracaoStrategy <T>{
    BigDecimal calcularRemuneracao(T... criteriosParam);
}
