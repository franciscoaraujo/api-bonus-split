package com.bytebuilder.apibonussplit.domain.entity;

import com.bytebuilder.apibonussplit.domain.enums.Cargo;
import com.bytebuilder.apibonussplit.domain.enums.Departamento;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Funcionario {
    private Integer id;
    private Integer numeroMatricula;
    private String nome;
    private Cargo cargo;
    private Departamento departamento;
}
