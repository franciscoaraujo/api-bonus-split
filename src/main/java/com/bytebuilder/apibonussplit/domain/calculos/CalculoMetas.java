package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.dtos.MetasDto;
import com.bytebuilder.apibonussplit.domain.entity.criterio.CriterioVariavelDeCalculo;
import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import com.bytebuilder.apibonussplit.repository.VariavelDeCalculoRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Component
public class CalculoMetas implements CalculoRemuneracaoStrategy<MetasDto> {
    @Override
    public BigDecimal calcularRemuneracao(MetasDto... criteriosParam) {

        VariavelDeCalculoRepository variavelDeCalculoRepository = new VariavelDeCalculoRepository();
        List<CriterioVariavelDeCalculo> criterioVariavelDeCalculoStream = variavelDeCalculoRepository
                .getVariavelCalculoMetas()
                .stream().filter(x -> x.getCriterioCalculo().equals(CriterioCalculo.METAS_ALCANCADAS))
                .collect(Collectors.toList());

        BigDecimal porcentagemAlcancada = criteriosParam[0].getPercentual();

        BigDecimal bonusPorExcessoMeta = criterioVariavelDeCalculoStream.stream().map(CriterioVariavelDeCalculo::getValorBaseCriterio).findFirst().get();
        BigDecimal bonusPorMilVendas = criterioVariavelDeCalculoStream.stream().map(CriterioVariavelDeCalculo::getValorOffSet).findFirst().get();
        BigDecimal resultadoCalculo = BigDecimal.ZERO;

        if (porcentagemAlcancada.compareTo(new BigDecimal(100)) > 0) {
            resultadoCalculo = porcentagemAlcancada.subtract(new BigDecimal(100)).multiply(bonusPorExcessoMeta);
        }
        log.info("--------------------------------------------------");
        log.info("VALOR BASE DE CALCULO: {} ", bonusPorExcessoMeta.setScale(2, RoundingMode.HALF_EVEN));
        log.info("VALOR Á RECEBER: {}", resultadoCalculo.setScale(2, RoundingMode.HALF_EVEN));
        log.info("--------------------------------------------------");

        return resultadoCalculo;
    }
}
