package com.bytebuilder.apibonussplit.service.calculos;

import com.bytebuilder.apibonussplit.domain.calculos.CalculoVendas;
import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculoVendasServices {


    public Remuneracao getCalculosRemuneracaoVenda(VendaDto vendaDto) {
        CalculoVendas calculoVendas = new CalculoVendas();
       Venda vendaModel =  VendaDto.toModel(vendaDto);
        BigDecimal valorCalculado = calculoVendas.calcularRemuneracao(vendaModel);
        Remuneracao remuneracao = new Remuneracao();
        remuneracao.setValorApagar(valorCalculado);

        return remuneracao;
    }

}
