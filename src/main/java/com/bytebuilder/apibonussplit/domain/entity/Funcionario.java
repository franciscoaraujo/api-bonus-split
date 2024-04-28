package com.bytebuilder.apibonussplit.domain.entity;

import com.bytebuilder.apibonussplit.domain.enums.Cargo;
import com.bytebuilder.apibonussplit.domain.enums.Departamento;
import lombok.Data;

@Data
public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private Departamento departamento;
}
