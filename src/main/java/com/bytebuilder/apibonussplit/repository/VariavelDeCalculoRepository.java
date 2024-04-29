package com.bytebuilder.apibonussplit.repository;

import com.bytebuilder.apibonussplit.domain.entity.criterio.CriterioVariavelDeCalculo;
import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class VariavelDeCalculoRepository {
    private List<CriterioVariavelDeCalculo> listCriterioVariavelDeCalculo = new ArrayList<>();

    public List<CriterioVariavelDeCalculo> getVariavelCalculoVendas() {
        BigDecimal valorBase = new BigDecimal(1500.00);
        BigDecimal valorBonus = new BigDecimal(80.50);

        CriterioVariavelDeCalculo criterioVariavelDeCalculoVenda = new CriterioVariavelDeCalculo();
        criterioVariavelDeCalculoVenda.setCriterioCalculo(CriterioCalculo.VENDAS_REALIZADAS);
        criterioVariavelDeCalculoVenda.setValorBaseCriterio(valorBase);
        criterioVariavelDeCalculoVenda.setValorOffSet(valorBonus);

        listCriterioVariavelDeCalculo.add(criterioVariavelDeCalculoVenda);

        return listCriterioVariavelDeCalculo;
    }

    // Supondo que para cada 1% acima da meta, o funcionário recebe um bônus de R$ 8,80
    public List<CriterioVariavelDeCalculo> getVariavelCalculoMetas() {
        BigDecimal bonusPorExcessoMeta = new BigDecimal(8.89);
        BigDecimal descontoPorAbaixoMeta = new BigDecimal(5.00);

        CriterioVariavelDeCalculo criterioVariavelDeCalculoVenda = new CriterioVariavelDeCalculo();
        criterioVariavelDeCalculoVenda.setCriterioCalculo(CriterioCalculo.METAS_ALCANCADAS);
        criterioVariavelDeCalculoVenda.setValorBaseCriterio(bonusPorExcessoMeta);
        criterioVariavelDeCalculoVenda.setValorOffSet(descontoPorAbaixoMeta);
        
        listCriterioVariavelDeCalculo.add(criterioVariavelDeCalculoVenda);

        return listCriterioVariavelDeCalculo;
    }

}
