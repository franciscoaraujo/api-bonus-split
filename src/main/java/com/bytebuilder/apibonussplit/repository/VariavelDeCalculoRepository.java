package com.bytebuilder.apibonussplit.repository;

import com.bytebuilder.apibonussplit.domain.entity.criterios.VariavelDeCalculo;
import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;


public class VariavelDeCalculoRepository {
    private List<VariavelDeCalculo> listVariavelDeCalculo = new ArrayList<>();

    public List<VariavelDeCalculo> getVariavelCalculoVendas() {
        BigDecimal valorBase = new BigDecimal(1000.00);
        BigDecimal valorBonus = new BigDecimal(50.00);

        VariavelDeCalculo variavelDeCalculoVenda = new VariavelDeCalculo();
        variavelDeCalculoVenda.setCriterioCalculo(CriterioCalculo.VENDAS_REALIZADAS);
        variavelDeCalculoVenda.setValorBaseCriterio(valorBase);
        variavelDeCalculoVenda.setValorOffSet(valorBonus);

        listVariavelDeCalculo.add(variavelDeCalculoVenda);

        return listVariavelDeCalculo;
    }

    // Supondo que para cada 1% acima da meta, o funcionário recebe um bônus de R$ 10,00
    // e para cada 1% abaixo da meta, o funcionário tem um desconto de R$ 5,00
    public List<VariavelDeCalculo> getVariavelCalculoMetas() {
        BigDecimal bonusPorExcessoMeta = new BigDecimal(10.00);
        BigDecimal descontoPorAbaixoMeta = new BigDecimal(5.00);

        VariavelDeCalculo variavelDeCalculoVenda = new VariavelDeCalculo();
        variavelDeCalculoVenda.setCriterioCalculo(CriterioCalculo.METAS_ALCANCADAS);
        variavelDeCalculoVenda.setValorBaseCriterio(bonusPorExcessoMeta);
        variavelDeCalculoVenda.setValorOffSet(descontoPorAbaixoMeta);
        
        listVariavelDeCalculo.add(variavelDeCalculoVenda);

        return listVariavelDeCalculo;
    }

}
