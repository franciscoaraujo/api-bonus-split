package com.bytebuilder.apibonussplit.api.v1.controller;

import com.bytebuilder.apibonussplit.domain.dtos.RemuneracaoDto;
import com.bytebuilder.apibonussplit.domain.dtos.VendaDto;
import com.bytebuilder.apibonussplit.domain.entity.Remuneracao;
import com.bytebuilder.apibonussplit.service.calculos.CalculoVariavelVendasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculo/variavel")
public class CalculoVariavelVendaController {

    @Autowired
    private CalculoVariavelVendasServices calculoVariavelVendasServices;

    @PostMapping("/venda")
    public ResponseEntity<RemuneracaoDto> getRemuneracaoBonusVendas(@RequestBody VendaDto vendaDto) {
        return ResponseEntity.ok().body(calculoVariavelVendasServices.getCalculosRemuneracaoVenda(vendaDto));
    }
}
