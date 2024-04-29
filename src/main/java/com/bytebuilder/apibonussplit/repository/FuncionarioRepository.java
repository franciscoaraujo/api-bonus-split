package com.bytebuilder.apibonussplit.repository;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import com.bytebuilder.apibonussplit.domain.enums.Cargo;
import com.bytebuilder.apibonussplit.domain.enums.Departamento;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {

    public static List<Funcionario> listFuncionario = new ArrayList<>();

    public List<Funcionario> getFuncionarios() {
        List<Funcionario> listFunc = new ArrayList<>();

        var func01 = Funcionario.builder()
                .nome("Paulo Antonio de Souza")
                .numeroMatricula(1)
                .cargo(Cargo.VENDEDOR)
                .departamento(Departamento.VENDAS)
                .build();
        listFunc.add(func01);

        var func02 = Funcionario.builder()
                .nome("Francisco Araujo")
                .numeroMatricula(2)
                .cargo(Cargo.GERENTE)
                .departamento(Departamento.TECNOLOGIA)
                .build();
        listFunc.add(func02);

        var func03 = Funcionario.builder()
                .nome("Carlos Pereira")
                .numeroMatricula(3)
                .cargo(Cargo.ASSISTENTE)
                .departamento(Departamento.MARKETING)
                .build();
        listFunc.add(func03);

        var func04 = Funcionario.builder()
                .nome("Lucinda Tomaz")
                .numeroMatricula(4)
                .cargo(Cargo.SUPERVISOR)
                .departamento(Departamento.VENDAS)
                .build();
        listFunc.add(func04);

        return listFunc;
    }
}
