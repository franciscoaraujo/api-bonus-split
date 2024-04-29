package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import com.bytebuilder.apibonussplit.domain.enums.TipoAvaliacao;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class QualidadeTrabalhoDto {
    private Funcionario funcionario;
    private LocalDateTime dtAvaliacao;
    private TipoAvaliacao tipoAvaliacao;
}
