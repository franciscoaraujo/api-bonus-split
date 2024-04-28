package com.bytebuilder.apibonussplit.domain.entity.criterios;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class Lucratividade {
    private Funcionario funcionario;
    private LocalDateTime dtCadastro;
    private BigDecimal lucroLiquidoEmpresa;

}
