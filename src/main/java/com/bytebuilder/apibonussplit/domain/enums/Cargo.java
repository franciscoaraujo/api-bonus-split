package com.bytebuilder.apibonussplit.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Cargo {
    DIRETOR(1, "Diretor"),
    GERENTE(2, "Gerente"),
    SUPERVISOR(3, "Supervisor"),
    ASSISTENTE(4, "Assistente"),
    VENDEDOR(5, "Vendedor");

    private int codigo;
    private String descricao;

    public static Cargo getCargo(int codigo) {
        return Arrays.stream(Cargo.values()).filter(x -> x.codigo == codigo).findAny().get();
    }
}
