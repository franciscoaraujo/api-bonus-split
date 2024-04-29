package com.bytebuilder.apibonussplit.domain.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Departamento {

    VENDAS(1, "Vendas"),
    MARKETING(2, "Marketing"),
    FINANCAS(3, "Finanças"),
    RH(3, "RH"),
    TECNOLOGIA(4, "Tecnologia");

    private int codigo;
    private String descricao;

    public static Departamento getDepartamento(int codigo) {
        return Arrays.stream(Departamento.values()).filter(x -> x.codigo == codigo).findAny().get();
    }
}
