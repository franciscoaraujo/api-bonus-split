package com.bytebuilder.apibonussplit.domain;

import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVendasServices;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;

@Log4j2
public class Main {

  /*  public static void main(String[] args) {
        CalculoVendasServices calculoVendasServices = new CalculoVendasServices(vendaMapper);
        VendaDto venda = new VendaDto();
        venda.setValorVenda(new BigDecimal(2850.58));

        Remuneracao calculosRemuneracaoVenda = calculoVendasServices.getCalculosRemuneracaoVenda(venda);

        log.info("Valor da Remuneracao Variavel: R$ {}", calculosRemuneracaoVenda.getValorApagar());

    }*/
}
