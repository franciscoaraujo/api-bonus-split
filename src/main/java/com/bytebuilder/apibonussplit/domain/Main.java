package com.bytebuilder.apibonussplit.domain;

import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Venda;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVendasServices;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;

@Log4j2
public class Main {

    public static void main(String[] args) {
        CalculoVendasServices calculoVendasServices = new CalculoVendasServices();
        Venda venda = new Venda();
        venda.setValorVenda(new BigDecimal(2850.58));
        venda.setQuantidade(100);
        Remuneracao calculosRemuneracaoVenda = calculoVendasServices.getCalculosRemuneracaoVenda(venda);

        log.info("Valor da Remuneracao Variavel: R$ {}", calculosRemuneracaoVenda.getValorApagar());

    }
}
