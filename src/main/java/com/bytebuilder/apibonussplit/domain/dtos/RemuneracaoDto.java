package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RemuneracaoDto {
    private FuncionarioDto funcionario;
    private BigDecimal valorApagar;
    private String dtCriacao;

    public static RemuneracaoDto toDto(Remuneracao remuneracao) {
        return RemuneracaoDto.builder()
                .dtCriacao(String.valueOf(remuneracao.getDtCriacao()))
                .valorApagar(remuneracao.getValorApagar())
                .funcionario(FuncionarioDto.toDto(remuneracao.getFuncionario()))
                .build();
    }
}
