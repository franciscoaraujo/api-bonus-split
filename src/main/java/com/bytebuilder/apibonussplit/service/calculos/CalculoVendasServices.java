package com.bytebuilder.apibonussplit.service.calculos;

import com.bytebuilder.apibonussplit.domain.calculos.CalculoVendas;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Venda;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculoVendasServices {

    public Remuneracao getCalculosRemuneracaoVenda(Venda venda) {
        CalculoVendas calculoVendas = new CalculoVendas();
        BigDecimal valorCalculado = calculoVendas.calcularRemuneracao(venda);
        Remuneracao remuneracao = new Remuneracao();
        remuneracao.setValorApagar(valorCalculado);
        return remuneracao;
    }

}
