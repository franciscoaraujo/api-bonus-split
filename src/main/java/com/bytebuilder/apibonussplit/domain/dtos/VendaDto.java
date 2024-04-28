package com.bytebuilder.apibonussplit.domain.dtos;

import com.bytebuilder.apibonussplit.domain.entity.Funcionario;
import com.bytebuilder.apibonussplit.domain.entity.criterios.Venda;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class VendaDto {

    private Funcionario funcionario;
    private LocalDateTime dataVenda = LocalDateTime.now();
    private Integer quantidade;
    private BigDecimal valorVenda;

    public static Venda toModel(VendaDto dto) {
        Venda vendaModel = new Venda();
        vendaModel.setValorVenda(dto.getValorVenda());
        vendaModel.setDataVenda(dto.getDataVenda());
        vendaModel.setFuncionario(dto.getFuncionario());
        return vendaModel;
    }
}
