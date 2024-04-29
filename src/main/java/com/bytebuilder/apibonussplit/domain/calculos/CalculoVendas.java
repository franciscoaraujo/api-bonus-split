package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.criterio.CriterioVariavelDeCalculo;

import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import com.bytebuilder.apibonussplit.repository.VariavelDeCalculoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Component
public class CalculoVendas implements CalculoRemuneracaoStrategy<VendaDto> {

    @Override
    public BigDecimal calcularRemuneracao(VendaDto... criteriosParam) {

        log.info("Iniciando o calculo sobre as Vendas...");

        VariavelDeCalculoRepository variavelDeCalculoRepository = new VariavelDeCalculoRepository();
        List<CriterioVariavelDeCalculo> criterioVariavelDeCalculoStream = variavelDeCalculoRepository
                .getVariavelCalculoVendas()
                .stream().filter(x -> x.getCriterioCalculo().equals(CriterioCalculo.VENDAS_REALIZADAS))
                .collect(Collectors.toList());

        //LocalDateTime dataVenda = criteriosParam[0].getDataVenda();
        BigDecimal valorVenda = criteriosParam[0].getValorVenda();

        BigDecimal baseCalculo = criterioVariavelDeCalculoStream.stream().map(CriterioVariavelDeCalculo::getValorBaseCriterio).findFirst().get();
        BigDecimal bonusPorMilVendas = criterioVariavelDeCalculoStream.stream().map(CriterioVariavelDeCalculo::getValorOffSet).findFirst().get();
        BigDecimal resultadoCalculo = BigDecimal.valueOf((valorVenda.doubleValue() / baseCalculo.doubleValue()) * bonusPorMilVendas.doubleValue());

        log.info("--------------------------------------------------");
        log.info("VALOR BASE DE CALCULO: {},00", baseCalculo);
        log.info("VALOR BONUS POR MIL VANDAS: {},00", bonusPorMilVendas);
        log.info("VALOR DA VENDA REALIZADA: {}", valorVenda);
       // log.info("DATA DA VENDA REALIZADA: {}", dataVenda.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        log.info("VALOR Á RECEBER: {}", resultadoCalculo.setScale(2, RoundingMode.HALF_EVEN));
        log.info("--------------------------------------------------");

        return resultadoCalculo;
    }
}
