package com.bytebuilder.apibonussplit.repository;

import com.bytebuilder.apibonussplit.domain.entity.criterios.VariavelDeCalculo;
import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class VariavelDeCalculoRepository {
    private List<VariavelDeCalculo> listVariavelDeCalculo = new ArrayList<>();
    private  BigDecimal valorBase = new BigDecimal(1000.00);
    private BigDecimal valorBonus = new BigDecimal(50.00);

    public  List<VariavelDeCalculo> getVariavelCalculoVendas() {
        VariavelDeCalculo variavelDeCalculoVenda = new VariavelDeCalculo();
        variavelDeCalculoVenda.setCriterioCalculo(CriterioCalculo.VENDAS_REALIZADAS);
        variavelDeCalculoVenda.setValorBaseCriterio(valorBase);
        variavelDeCalculoVenda.setValorBonus(valorBonus);
        listVariavelDeCalculo.add(variavelDeCalculoVenda);
        return listVariavelDeCalculo;

    }
}
