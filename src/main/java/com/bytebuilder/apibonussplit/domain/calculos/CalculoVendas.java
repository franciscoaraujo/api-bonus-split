package com.bytebuilder.apibonussplit.domain.calculos;

import com.bytebuilder.apibonussplit.domain.entity.criterios.VariavelDeCalculo;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Venda;
import com.bytebuilder.apibonussplit.domain.enums.CriterioCalculo;
import com.bytebuilder.apibonussplit.repository.VariavelDeCalculoRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
@Data
public class CalculoVendas implements CalculoRemuneracaoStrategy<Venda> {

    @Override
    public BigDecimal calcularRemuneracao(Venda... criteriosParam) {

        log.info("Iniciando o calculo sobre as Vendas...");

        VariavelDeCalculoRepository variavelDeCalculoRepository = new VariavelDeCalculoRepository();

        List<VariavelDeCalculo> variavelDeCalculoStream = variavelDeCalculoRepository
                .getVariavelCalculoVendas()
                .stream().filter(x -> x.getCriterioCalculo().equals(CriterioCalculo.VENDAS_REALIZADAS))
                .collect(Collectors.toList());

        LocalDateTime dataVenda = criteriosParam[0].getDataVenda();

        BigDecimal baseCalculo = variavelDeCalculoStream.stream().map(VariavelDeCalculo::getValorBaseCriterio).findFirst().get();
        BigDecimal bonusPorMilVendas = variavelDeCalculoStream.stream().map(VariavelDeCalculo::getValorOffSet).findFirst().get();
        BigDecimal valorVenda = criteriosParam[0].getValorVenda().setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal resultadoCalculo = valorVenda.divide(baseCalculo).multiply(bonusPorMilVendas).setScale(2, RoundingMode.HALF_EVEN);

        log.info("VALOR BASE DE CALCULO: {},00", baseCalculo);
        log.info("VALOR BONUS POR MIL VANDAS: {},00", bonusPorMilVendas);
        log.info("VALOR DA VENDA REALIZADA: {}", valorVenda);
        log.info("DATA DA VENDA REALIZADA: {}", dataVenda.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        log.info("VALOR Á RECEBER: {}", resultadoCalculo);

        return resultadoCalculo;
    }
}
