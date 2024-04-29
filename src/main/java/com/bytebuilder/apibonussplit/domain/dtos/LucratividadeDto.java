package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class LucratividadeDto {
    private Funcionario funcionario;
    private LocalDateTime dtCadastro;
    private BigDecimal lucroLiquidoEmpresa;

}
