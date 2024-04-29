package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import com.bytebuilder.apibonussplit.domain.enums.Cargo;
import com.bytebuilder.apibonussplit.domain.enums.Departamento;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class FuncionarioDto {
    private Integer numeroMatricula;
    private String nome;
    private int cargo;
    private int departamento;

    public static FuncionarioDto toDto(Funcionario funcionario) {
        return FuncionarioDto.builder()
                .cargo(funcionario.getCargo().getCodigo())
                .numeroMatricula(funcionario.getNumeroMatricula())
                .departamento(funcionario.getDepartamento().getCodigo())
                .nome(funcionario.getNome())
                .build();
    }

    public static Funcionario toModel(FuncionarioDto funcionarioDto) {
        return Funcionario.builder()
                .cargo(Cargo.getCargo(funcionarioDto.getCargo()))
                .numeroMatricula(funcionarioDto.getNumeroMatricula())
                .departamento(Departamento.getDepartamento(funcionarioDto.getDepartamento()))
                .nome(funcionarioDto.getNome())
                .build();
    }
}
